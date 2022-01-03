import ProjectVersions.openosrsVersion

version = "1.1.0"

project.extra["PluginName"] = "JoeThieving"
project.extra["PluginDescription"] = "Joe's Thieving Plugin"

dependencies {
	annotationProcessor(Libraries.lombok)
	annotationProcessor(Libraries.pf4j)

	compileOnly("com.openosrs:runelite-api:$openosrsVersion+")
	compileOnly("com.openosrs:runelite-client:$openosrsVersion+")
	compileOnly("com.intellij:annotations:+@jar")

	compileOnly(Libraries.guice)
	compileOnly(Libraries.javax)
	compileOnly(Libraries.lombok)
	compileOnly(Libraries.pf4j)
}

tasks {
	jar {
		manifest {
			attributes(mapOf(
					"Plugin-Version" to project.version,
					"Plugin-Id" to nameToId(project.extra["PluginName"] as String),
					"Plugin-Provider" to project.extra["PluginProvider"],
					"Plugin-Description" to project.extra["PluginDescription"],
					"Plugin-License" to project.extra["PluginLicense"]
			))
		}
	}
}