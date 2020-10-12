package others

/**
 * User          : zhouchenbin
 * Date          : 2020-09-29
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
class KotlinGroupByDemo {

    fun mockDemo(): List<Bean> {
        val list = mutableListOf<Bean>()
        //subBean1
        val subBean1 = mutableListOf<SubBean>()
        subBean1.add(SubBean("subBean1", 1))
        //bean1
        val bean1 = Bean("bean1", 100, subBean1)

        //subBean2
        val subBean2 = mutableListOf<SubBean>()
        subBean2.add(SubBean("subBean1", 1))
        val bean2 = Bean("bean2", 100, subBean2)

        list.add(bean1)
        list.add(bean2)
        return list
    }
    fun groupBy(list:List<Bean>){
        val groupBy = list.groupBy {
            it.list
        }
        println(groupBy.size)
        groupBy.forEach { t, u ->
            println(t)
        }
    }
}

data class Bean(
        var name: String?,
        var age: Int?,
        var list: List<SubBean>?
)

data class SubBean(
        var subName: String?,
        var subAge: Int?
)