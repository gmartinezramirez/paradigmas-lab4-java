package org.example.model;

class Cliente {
    private String userName;
    private Carrito carrito = new Carrito();

    Cliente(String userName) throws TienditaException {
        if (userName.equals(""))
            throw (new TienditaException(100, "Nombre Usuario Invalido"));

        this.userName = userName;
    }

    void addProduct(Producto p) {
        this.carrito.add(p);
    }

    @Override
    public boolean equals(Object o) {
        //versión básica de Equals
        //sin comprobación de tipos para asegurar casting
        //En Producto se ofrece una implementación completa
        //de Equals
        Cliente tmpCli = (Cliente) o;
        return (this.userName.equals(tmpCli.userName));
    }

}
