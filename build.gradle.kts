val gpr: DependencyHandler.(String, String?) -> Any by extra
fun DependencyHandler.projectOrGithubPackage(path: String, configuration: String? = null): Any = gpr(path, configuration)

dependencies {
    compileOnly(projectOrGithubPackage(":zombiecraft-utility"))

    // spigot
    compileOnly("org.spigotmc:spigot-api:1.20.4-R0.1-SNAPSHOT")

    // test
    testImplementation("junit:junit:4.13.2")
    testImplementation(kotlin("test"))
}