package model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Evento.class)
public abstract class Evento_ extends model.ObjetoBase_ {

	public static volatile SingularAttribute<Evento, String> cidade;
	public static volatile SingularAttribute<Evento, String> endereco;
	public static volatile SingularAttribute<Evento, Integer> capacidade;
	public static volatile SingularAttribute<Evento, Calendar> dtCriacao;
	public static volatile SingularAttribute<Evento, String> nome;
	public static volatile ListAttribute<Evento, InscricaoEvento> inscricaoEventos;
	public static volatile SingularAttribute<Evento, Calendar> dtInicio;
	public static volatile SingularAttribute<Evento, Calendar> dtFim;
	public static volatile SingularAttribute<Evento, String> descricao;

}

