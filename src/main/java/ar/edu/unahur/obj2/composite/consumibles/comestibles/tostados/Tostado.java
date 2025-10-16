package ar.edu.unahur.obj2.composite.consumibles.comestibles.tostados;

import ar.edu.unahur.obj2.composite.consumibles.comestibles.Comestible;

public class Tostado extends Comestible{
    private TipoTostado tipo;

    public Tostado(String nombre, Double precioBase, Integer pesoGr, TipoTostado tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }    

    @Override
    protected Double doCosto() {
        return switch(tipo){
            case TipoTostado.JAMON_Y_QUESO -> 2.0;
            case TipoTostado.SALAME_Y_QUESO -> 5.0;
        };
    }

    public TipoTostado getTipo() {
        return tipo;
    }

    

}
