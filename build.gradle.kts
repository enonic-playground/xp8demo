plugins {
    alias(libs.plugins.enonic.xp.app)
}

repositories {
    mavenCentral()
    xp.enonicRepo("dev")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

app {
    name = providers.gradleProperty("appName").get()
    displayName = providers.gradleProperty("appDisplayName").get()
    vendorName = providers.gradleProperty("vendorName").get()
    vendorUrl = providers.gradleProperty("vendorUrl").get()
    systemVersion = libs.versions.xp.get()
}

dependencies {
    implementation(libs.xp.core.api)
    implementation(libs.xp.portal.api)
    include(libs.xp.lib.context)
    include(libs.xp.lib.node)
    include(libs.xp.lib.portal)
}
