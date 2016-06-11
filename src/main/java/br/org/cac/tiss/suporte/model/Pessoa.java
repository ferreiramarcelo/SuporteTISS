package br.org.cac.tiss.suporte.model;
// Generated 09/06/2016 19:01:50 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pessoa generated by hbm2java
 */
@Entity
@Table(name = "PESSOA")
public class Pessoa implements java.io.Serializable {

	private int idPessoa;
	private String nome;
	private char DSexo;
	private Date dtNascimento;
	private String nomeMae;
	private String cpf;
	private char DStatus;
	private Date dthrRegistroStatus;
	private Date dtFalecimento;
	private Date timestamp;
	private Integer codBen;
	private Integer seqBen;
	private Integer seqDep;
	private String nomePai;
	private Date dtCasamentoPessoa;
	private Character DEstadoCivil;
	private String cpfResponsavel;

	public Pessoa() {
	}

	public Pessoa(int idPessoa, String nome, char DSexo, char DStatus, Date dthrRegistroStatus, Date timestamp) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.DSexo = DSexo;
		this.DStatus = DStatus;
		this.dthrRegistroStatus = dthrRegistroStatus;
		this.timestamp = timestamp;
	}

	public Pessoa(int idPessoa, String nome, char DSexo, Date dtNascimento, String nomeMae, String cpf, char DStatus,
			Date dthrRegistroStatus, Date dtFalecimento, Date timestamp, Integer codBen, Integer seqBen, Integer seqDep,
			String nomePai, Date dtCasamentoPessoa, Character DEstadoCivil, String cpfResponsavel) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.DSexo = DSexo;
		this.dtNascimento = dtNascimento;
		this.nomeMae = nomeMae;
		this.cpf = cpf;
		this.DStatus = DStatus;
		this.dthrRegistroStatus = dthrRegistroStatus;
		this.dtFalecimento = dtFalecimento;
		this.timestamp = timestamp;
		this.codBen = codBen;
		this.seqBen = seqBen;
		this.seqDep = seqDep;
		this.nomePai = nomePai;
		this.dtCasamentoPessoa = dtCasamentoPessoa;
		this.DEstadoCivil = DEstadoCivil;
		this.cpfResponsavel = cpfResponsavel;
	}

	@Id

	@Column(name = "id_pessoa", unique = true, nullable = false)
	public int getIdPessoa() {
		return this.idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	@Column(name = "nome", nullable = false, length = 70)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "d_sexo", nullable = false, length = 1)
	public char getDSexo() {
		return this.DSexo;
	}

	public void setDSexo(char DSexo) {
		this.DSexo = DSexo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_nascimento", length = 23)
	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Column(name = "nome_mae", length = 70)
	public String getNomeMae() {
		return this.nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Column(name = "cpf", length = 11)
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "d_status", nullable = false, length = 1)
	public char getDStatus() {
		return this.DStatus;
	}

	public void setDStatus(char DStatus) {
		this.DStatus = DStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dthr_registro_status", nullable = false, length = 23)
	public Date getDthrRegistroStatus() {
		return this.dthrRegistroStatus;
	}

	public void setDthrRegistroStatus(Date dthrRegistroStatus) {
		this.dthrRegistroStatus = dthrRegistroStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_falecimento", length = 23)
	public Date getDtFalecimento() {
		return this.dtFalecimento;
	}

	public void setDtFalecimento(Date dtFalecimento) {
		this.dtFalecimento = dtFalecimento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", nullable = false, length = 23)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Column(name = "cod_ben")
	public Integer getCodBen() {
		return this.codBen;
	}

	public void setCodBen(Integer codBen) {
		this.codBen = codBen;
	}

	@Column(name = "seq_ben")
	public Integer getSeqBen() {
		return this.seqBen;
	}

	public void setSeqBen(Integer seqBen) {
		this.seqBen = seqBen;
	}

	@Column(name = "seq_dep")
	public Integer getSeqDep() {
		return this.seqDep;
	}

	public void setSeqDep(Integer seqDep) {
		this.seqDep = seqDep;
	}

	@Column(name = "nome_pai", length = 70)
	public String getNomePai() {
		return this.nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_casamento_pessoa", length = 23)
	public Date getDtCasamentoPessoa() {
		return this.dtCasamentoPessoa;
	}

	public void setDtCasamentoPessoa(Date dtCasamentoPessoa) {
		this.dtCasamentoPessoa = dtCasamentoPessoa;
	}

	@Column(name = "d_estado_civil", length = 1)
	public Character getDEstadoCivil() {
		return this.DEstadoCivil;
	}

	public void setDEstadoCivil(Character DEstadoCivil) {
		this.DEstadoCivil = DEstadoCivil;
	}

	@Column(name = "cpf_responsavel", length = 11)
	public String getCpfResponsavel() {
		return this.cpfResponsavel;
	}

	public void setCpfResponsavel(String cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}

}
