package TD_Class

sealed class OrderStatus {
    object Pending : OrderStatus()
    object Preparing : OrderStatus()
    object Shipped : OrderStatus()
    object Delivered : OrderStatus()
}