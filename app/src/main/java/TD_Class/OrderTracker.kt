package TD_Class

fun trackOrder(order: Order) {
    when (order.status) {
        is OrderStatus.Pending -> println("Commande #${order.orderId}: En attente")
        is OrderStatus.Preparing -> println("Commande #${order.orderId}: En cours de préparation")
        is OrderStatus.Shipped -> println("Commande #${order.orderId}: Expédiée")
        is OrderStatus.Delivered -> println("Commande #${order.orderId}: Livraison terminée")
    }
}
