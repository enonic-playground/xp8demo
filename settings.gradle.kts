rootProject.name = providers.gradleProperty("projectName").get()

dependencyResolutionManagement {
    versionCatalogs {
        configureEach {
            version("xp", providers.gradleProperty("xpVersion").get())
        }
    }
}
