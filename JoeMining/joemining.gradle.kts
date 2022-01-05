version = "1.1.0"

project.extra["PluginName"] = "JoeMining"
project.extra["PluginDescription"] = "Joe's Mining Plugin"

dependencies {
	implementation(project(":ExtUtils"))
}

tasks {
	jar {
		manifest {
			attributes(mapOf(
					"Plugin-Version" to project.version,
					"Plugin-Id" to nameToId(project.extra["PluginName"] as String),
					"Plugin-Provider" to project.extra["PluginProvider"],
					"Plugin-Dependencies" to nameToId("extutils"),
					"Plugin-Description" to project.extra["PluginDescription"],
					"Plugin-License" to project.extra["PluginLicense"]
			))
		}
	}
}