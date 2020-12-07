package model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Log.class)
public abstract class Log_ extends model.ObjetoBase_ {

	public static volatile SingularAttribute<Log, Calendar> dtCriacao;
	public static volatile SingularAttribute<Log, Usuario> usuario;
	public static volatile SingularAttribute<Log, String> acao;
	public static volatile SingularAttribute<Log, String> modelo;
	public static volatile SingularAttribute<Log, String> descricao;

}

