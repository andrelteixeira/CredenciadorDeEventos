package model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ extends model.ObjetoBase_ {

	public static volatile SingularAttribute<Pessoa, String> cidade;
	public static volatile SingularAttribute<Pessoa, String> telefone;
	public static volatile SingularAttribute<Pessoa, String> endereco;
	public static volatile SingularAttribute<Pessoa, String> rg;
	public static volatile SingularAttribute<Pessoa, String> cpf;
	public static volatile SingularAttribute<Pessoa, String> matricula;
	public static volatile SingularAttribute<Pessoa, Calendar> dtCriacao;
	public static volatile SingularAttribute<Pessoa, String> nome;
	public static volatile ListAttribute<Pessoa, InscricaoEvento> inscricaoEventos;
	public static volatile SingularAttribute<Pessoa, String> email;

}

