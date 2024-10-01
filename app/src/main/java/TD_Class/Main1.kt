package TD_Class

fun main() {
    val order1 = Order(123, OrderStatus.Pending)
    val order2 = Order(456, OrderStatus.Shipped)

    trackOrder(order1)
    trackOrder(order2)
}