// HeroSignal Java sunucu SDK'sı (io.herosignal:herosignal-java).
//
// Bağımlılık seçimi: JSON için Jackson (jackson-databind). java.net.http yerleşik bir JSON eşleyici içermez; Jackson
// genel tipler (List<Model>, Map<String, …>), null alanları atlama ve bilinmeyen alanları yok sayma (sözleşmeye yeni
// alan eklendiğinde eski SDK'nın kırılmaması) için olgun ve yaygın bir standarttır. Gson bu ayarların bir kısmını
// sunmaz; el yazımı bir JSON eşleyici ise 189 model için hata riskini artırır. Başka çalışma zamanı bağımlılığı yoktur.
plugins {
    `java-library`
    `maven-publish`
}

group = "io.herosignal"
version = "0.1.0"

repositories {
    mavenCentral()
}

java {
    withSourcesJar()
    withJavadocJar()
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-databind:2.17.2")

    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<JavaCompile>().configureEach {
    // Java 11+ çalışma zamanı (java.net.http) hedeflenir; derleme daha yeni JDK ile yapılabilir.
    options.release.set(11)
    options.encoding = "UTF-8"
    options.compilerArgs.addAll(listOf("-Xlint:all", "-Xlint:-serial", "-Werror"))
}

tasks.withType<Javadoc>().configureEach {
    options.encoding = "UTF-8"
    (options as StandardJavadocDocletOptions).apply {
        charSet = "UTF-8"
        addStringOption("Xdoclint:all,-missing", "-quiet")
    }
}

tasks.test {
    useJUnitPlatform()
    // Ortak webhook imza vektörleri (Node/PHP/Python/Go/.NET/Ruby ile aynı).
    systemProperty("herosignal.testdata", file("../testdata").absolutePath)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name.set("HeroSignal Java SDK")
                description.set("HeroSignal sunucu SDK'sı: bildirim gönderme, kullanıcı/abonelik yönetimi ve webhook imza doğrulaması")
                licenses {
                    license {
                        name.set("MIT")
                    }
                }
            }
        }
    }
}
