package org.xialei.spring4.ch3.conditional

class WindowsListService : ListService {
    override fun showListCmd(): String {
        return "dir"
    }
}