package com.github.silencell.llhtemplate.services

import com.intellij.openapi.project.Project
import com.github.silencell.llhtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
