package model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ extends model.ObjetoBase_ {

	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile SingularAttribute<Usuario, Boolean> eadmin;
	public static volatile SingularAttribute<Usuario, Calendar> dtCriacao;
	public static volatile SingularAttribute<Usuario, String> nome;
	public static volatile ListAttribute<Usuario, InscricaoEvento> inscricaoEventos;
	public static volatile SingularAttribute<Usuario, String> login;
	public static volatile ListAttribute<Usuario, Log> logs;

}

