/**
  * Created by kiper on 19.06.17.
  */


class ProductPrototype extends CloneableProduct{
  override def clone = super.clone

  def buy(){}

  def addToCart(){}

  def removeFromCart(){}
}

class CloneableProduct {
  override def clone = super.clone
}