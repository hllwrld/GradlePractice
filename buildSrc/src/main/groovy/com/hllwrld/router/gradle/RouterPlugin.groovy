package com.hllwrld.router.gradle
import org.gradle.api.Project
import org.gradle.api.Plugin

class RouterPlugin implements Plugin<Project> {


    void apply(Project project) {
        println("hllwrld plugin success!!")

        project.getExtensions().create("router", RouterExtension)

        project.afterEvaluate {
            RouterExtension routerExtension = project["router"]
            println("hllwrld:"+routerExtension.wikiDir)
        }

    }



}