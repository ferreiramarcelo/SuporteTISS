package br.org.cac.tiss.suporte.model;
// Generated 09/06/2016 19:01:50 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Procedimento generated by hbm2java
 */
@Entity
@Table(name = "PROCEDIMENTO")
public class Procedimento implements java.io.Serializable {

	private ProcedimentoId id;
	private Atendimento atendimento;
	private Procedimento procedimento;
	private Double valorApresentado;
	private Double valorCalculado;
	private Double valorPago;
	private Double valorParticipacaoBruto;
	private Integer idAmb;
	private Double quantidadeAmb;
	private Integer idProfissionalEquipe;
	private Integer idComando;
	private Date timestamp;
	private Date dthrRealInicial;
	private Date dthrRealFinal;
	private Integer idTipoTabela;
	private Character FOpm;
	private Set<Procedimento> procedimentos = new HashSet<Procedimento>(0);

	public Procedimento() {
	}

	public Procedimento(ProcedimentoId id, Atendimento atendimento, Date timestamp) {
		this.id = id;
		this.atendimento = atendimento;
		this.timestamp = timestamp;
	}

	public Procedimento(ProcedimentoId id, Atendimento atendimento, Procedimento procedimento, Double valorApresentado,
			Double valorCalculado, Double valorPago, Double valorParticipacaoBruto, Integer idAmb, Double quantidadeAmb,
			Integer idProfissionalEquipe, Integer idComando, Date timestamp, Date dthrRealInicial, Date dthrRealFinal,
			Integer idTipoTabela, Character FOpm, Set<Procedimento> procedimentos) {
		this.id = id;
		this.atendimento = atendimento;
		this.procedimento = procedimento;
		this.valorApresentado = valorApresentado;
		this.valorCalculado = valorCalculado;
		this.valorPago = valorPago;
		this.valorParticipacaoBruto = valorParticipacaoBruto;
		this.idAmb = idAmb;
		this.quantidadeAmb = quantidadeAmb;
		this.idProfissionalEquipe = idProfissionalEquipe;
		this.idComando = idComando;
		this.timestamp = timestamp;
		this.dthrRealInicial = dthrRealInicial;
		this.dthrRealFinal = dthrRealFinal;
		this.idTipoTabela = idTipoTabela;
		this.FOpm = FOpm;
		this.procedimentos = procedimentos;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idProcesso", column = @Column(name = "id_processo", nullable = false)),
			@AttributeOverride(name = "anoApresentacao", column = @Column(name = "ano_apresentacao", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "idRepresentacao", column = @Column(name = "id_representacao", nullable = false)),
			@AttributeOverride(name = "DSubProcesso", column = @Column(name = "d_sub_processo", nullable = false, length = 1)),
			@AttributeOverride(name = "DNatureza", column = @Column(name = "d_natureza", nullable = false, length = 1)),
			@AttributeOverride(name = "idSequencialNatureza", column = @Column(name = "id_sequencial_natureza", nullable = false)),
			@AttributeOverride(name = "idAtendimento", column = @Column(name = "id_atendimento", nullable = false)),
			@AttributeOverride(name = "idProcedimento", column = @Column(name = "id_procedimento", nullable = false)) })
	public ProcedimentoId getId() {
		return this.id;
	}

	public void setId(ProcedimentoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "id_processo", referencedColumnName = "id_processo", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ano_apresentacao", referencedColumnName = "ano_apresentacao", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "id_representacao", referencedColumnName = "id_representacao", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "d_sub_processo", referencedColumnName = "d_sub_processo", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "d_natureza", referencedColumnName = "d_natureza", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "id_sequencial_natureza", referencedColumnName = "id_sequencial_natureza", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "id_atendimento", referencedColumnName = "id_atendimento", nullable = false, insertable = false, updatable = false) })
	public Atendimento getAtendimento() {
		return this.atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "id_processo_associado", referencedColumnName = "id_processo"),
			@JoinColumn(name = "ano_apresentacao_associado", referencedColumnName = "ano_apresentacao"),
			@JoinColumn(name = "id_representacao_associado", referencedColumnName = "id_representacao"),
			@JoinColumn(name = "d_sub_processo_associado", referencedColumnName = "d_sub_processo"),
			@JoinColumn(name = "d_natureza_associado", referencedColumnName = "d_natureza"),
			@JoinColumn(name = "id_seq_natureza_associado", referencedColumnName = "id_sequencial_natureza"),
			@JoinColumn(name = "id_atendimento_associado", referencedColumnName = "id_atendimento"),
			@JoinColumn(name = "id_procedimento_associado", referencedColumnName = "id_procedimento") })
	public Procedimento getProcedimento() {
		return this.procedimento;
	}

	public void setProcedimento(Procedimento procedimento) {
		this.procedimento = procedimento;
	}

	@Column(name = "valor_apresentado", precision = 53, scale = 0)
	public Double getValorApresentado() {
		return this.valorApresentado;
	}

	public void setValorApresentado(Double valorApresentado) {
		this.valorApresentado = valorApresentado;
	}

	@Column(name = "valor_calculado", precision = 53, scale = 0)
	public Double getValorCalculado() {
		return this.valorCalculado;
	}

	public void setValorCalculado(Double valorCalculado) {
		this.valorCalculado = valorCalculado;
	}

	@Column(name = "valor_pago", precision = 53, scale = 0)
	public Double getValorPago() {
		return this.valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	@Column(name = "valor_participacao_bruto", precision = 53, scale = 0)
	public Double getValorParticipacaoBruto() {
		return this.valorParticipacaoBruto;
	}

	public void setValorParticipacaoBruto(Double valorParticipacaoBruto) {
		this.valorParticipacaoBruto = valorParticipacaoBruto;
	}

	@Column(name = "id_amb", precision = 8, scale = 0)
	public Integer getIdAmb() {
		return this.idAmb;
	}

	public void setIdAmb(Integer idAmb) {
		this.idAmb = idAmb;
	}

	@Column(name = "quantidade_amb", precision = 53, scale = 0)
	public Double getQuantidadeAmb() {
		return this.quantidadeAmb;
	}

	public void setQuantidadeAmb(Double quantidadeAmb) {
		this.quantidadeAmb = quantidadeAmb;
	}

	@Column(name = "id_profissional_equipe")
	public Integer getIdProfissionalEquipe() {
		return this.idProfissionalEquipe;
	}

	public void setIdProfissionalEquipe(Integer idProfissionalEquipe) {
		this.idProfissionalEquipe = idProfissionalEquipe;
	}

	@Column(name = "id_comando")
	public Integer getIdComando() {
		return this.idComando;
	}

	public void setIdComando(Integer idComando) {
		this.idComando = idComando;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", nullable = false, length = 23)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dthr_real_inicial", length = 23)
	public Date getDthrRealInicial() {
		return this.dthrRealInicial;
	}

	public void setDthrRealInicial(Date dthrRealInicial) {
		this.dthrRealInicial = dthrRealInicial;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dthr_real_final", length = 23)
	public Date getDthrRealFinal() {
		return this.dthrRealFinal;
	}

	public void setDthrRealFinal(Date dthrRealFinal) {
		this.dthrRealFinal = dthrRealFinal;
	}

	@Column(name = "id_tipo_tabela")
	public Integer getIdTipoTabela() {
		return this.idTipoTabela;
	}

	public void setIdTipoTabela(Integer idTipoTabela) {
		this.idTipoTabela = idTipoTabela;
	}

	@Column(name = "f_opm", length = 1)
	public Character getFOpm() {
		return this.FOpm;
	}

	public void setFOpm(Character FOpm) {
		this.FOpm = FOpm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "procedimento")
	public Set<Procedimento> getProcedimentos() {
		return this.procedimentos;
	}

	public void setProcedimentos(Set<Procedimento> procedimentos) {
		this.procedimentos = procedimentos;
	}

}
