package com.notanull.peluqueriacanina.logica;

import com.notanull.peluqueriacanina.logica.Duenio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-08-21T23:48:22", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, Duenio> miDuenio;
    public static volatile SingularAttribute<Mascota, String> alergico;
    public static volatile SingularAttribute<Mascota, String> observaciones;
    public static volatile SingularAttribute<Mascota, Integer> numCliente;
    public static volatile SingularAttribute<Mascota, String> nombre;
    public static volatile SingularAttribute<Mascota, String> atencionEspecial;

}