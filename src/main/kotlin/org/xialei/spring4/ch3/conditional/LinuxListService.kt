package org.xialei.spring4.ch3.conditional

class LinuxListService : ListService {
    override fun showListCmd(): String {
        return "ls"
    }
}