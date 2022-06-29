package org.example.model;

class Producto {
    private String name;
    private int price;

    Producto(String name, int price) throws TienditaException {
        if (name.equals(""))
            throw new TienditaException(200, "Nombre producto invalido");

        if (price < 0)
            throw new TienditaException(200, "Nombre producto invalido");

        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if ((o == null) || (getClass() != o.getClass()))
            return false;

        Producto tmpProd = (Producto) o;

        return ((this.name.equals(tmpProd.name)) &&
                (this.price == tmpProd.price));

    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + " - $" + price + "\n";
    }

}