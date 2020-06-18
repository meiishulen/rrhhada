package ar.com.ada.api.rrhh.entities;
import java.math.BigDecimal;


public class Categoria{
    @Id
    @Column(name ='categoria_id')
    private int categoriaId;
    @Column(name = 'nombre')
    private String nombre;
    @Column( name = ' sueldo_base)')
    private BigDecimal sueldoBase;

}