package org.xialei.spring4.ch3.aware

import org.apache.commons.io.IOUtils
import org.springframework.beans.factory.BeanNameAware
import org.springframework.context.ResourceLoaderAware
import org.springframework.core.io.ResourceLoader
import org.springframework.stereotype.Service

@Service
open class AwareService : BeanNameAware, ResourceLoaderAware {
    private var beanName: String? = null
    private var loader: ResourceLoader? = null

    override fun setResourceLoader(resourceLoader: ResourceLoader?) {
        this.loader = resourceLoader
    }

    override fun setBeanName(name: String?) {
        this.beanName = name
    }

    fun outputResult() {
        println("Bean的名称为: $beanName")
        val resource = loader?.getResource("classpath:org/xialei/spring4/ch3/aware/test.txt")
        println("ResourceLoader加载的内容为: ${IOUtils.toString(resource?.inputStream)}")
    }
}