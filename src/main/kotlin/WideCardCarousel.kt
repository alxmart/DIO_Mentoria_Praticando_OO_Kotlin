class WideCardCarousel(
    private val items: List<WideCard>,
) : HomeItem{

    override val width: Int = getScreenWidth()

    override val height: Int = 100

    val itemCount: Int = items.size

    override fun contentDescription(): String {

        return "Lista com ${itemCount} items"
    }

    fun setItems(items: List<WideCard>) {
        this.items = items
    }

}

// Lista com 10 items