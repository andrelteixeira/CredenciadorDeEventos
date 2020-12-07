package model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InscricaoEvento.class)
public abstract class InscricaoEvento_ extends model.ObjetoBase_ {

	public static volatile SingularAttribute<InscricaoEvento, Boolean> presenca;
	public static volatile SingularAttribute<InscricaoEvento, Evento> evento;
	public static volatile SingularAttribute<InscricaoEvento, Calendar> dtInscricao;
	public static volatile SingularAttribute<InscricaoEvento, Pessoa> pessoa;
	public static volatile SingularAttribute<InscricaoEvento, Usuario> usuario;

}

