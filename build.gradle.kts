plugins {
    id("com.enonic.xp.app")
}

repositories {
    mavenCentral()
    xp.enonicRepo("dev")
}

dependencies {
    include(xplibs.context)
}
