package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.CuentaCorriente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-03T01:27:47")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends Persona_ {

    public static volatile SingularAttribute<Cliente, String> cuit;
    public static volatile SingularAttribute<Cliente, CuentaCorriente> cuentaCorriente;

}