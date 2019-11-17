package com.szytka.estacionamento.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szytka.estacionamento.domain.Cidade;
import com.szytka.estacionamento.domain.Cliente;
import com.szytka.estacionamento.domain.Endereco;
import com.szytka.estacionamento.domain.Estado;
import com.szytka.estacionamento.domain.Vaga;
import com.szytka.estacionamento.domain.Veiculo;
import com.szytka.estacionamento.domain.enums.TipoCliente;
import com.szytka.estacionamento.domain.enums.TipoVaga;
import com.szytka.estacionamento.repository.CidadeRepository;
import com.szytka.estacionamento.repository.ClienteRepository;
import com.szytka.estacionamento.repository.EnderecoRepository;
import com.szytka.estacionamento.repository.EstadoRepository;
import com.szytka.estacionamento.repository.VagaRepository;
import com.szytka.estacionamento.repository.VeiculoRepository;

@Service
public class DBService {

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private VagaRepository vagaRepository;

	@Autowired
	private VeiculoRepository veiculoRepository;

	public void instatiateTestDatabase() throws ParseException {
		Estado est1 = new Estado(null, "Parana", "PR");
		Estado est2 = new Estado(null, "Sao Paulo", "SP");
		Estado est3 = new Estado(null, "Santa Catarina", "SC");
		estadoRepository.saveAll(Arrays.asList(est1, est2, est3));

		Cidade cid1 = new Cidade(null, "Arapongas", est1);
		Cidade cid2 = new Cidade(null, "Cambira", est1);
		Cidade cid3 = new Cidade(null, "Sao Paulo", est2);
		Cidade cid4 = new Cidade(null, "Osasco", est2);
		Cidade cid5 = new Cidade(null, "Joinvile", est3);
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3, cid4, cid5));

		Cliente cli1 = new Cliente(null, "Jorge", "jorge@gmail.com", "11111444477", TipoCliente.PESSOAFISICA);
		Cliente cli2 = new Cliente(null, "Maria", "maria@gmail.com", "55555555555", TipoCliente.PESSOAJURIDICA);
		Cliente cli3 = new Cliente(null, "Jose", "jose@gmail.com", "1333333333", TipoCliente.PESSOAJURIDICA);
		Cliente cli4 = new Cliente(null, "Joao", "joao@gmail.com", "11111444447", TipoCliente.PESSOAFISICA);
		Cliente cli5 = new Cliente(null, "Tavim", "tavim@gmail.com", "111666666477", TipoCliente.PESSOAFISICA);
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));

		Endereco end1 = new Endereco(null, "Onoki", 555, "54546543216", cli2, cid3);
		enderecoRepository.saveAll(Arrays.asList(end1));

		Vaga vag1 = new Vaga(null, TipoVaga.VAZIA, 2, null);
		Vaga vag2 = new Vaga(null, TipoVaga.OCUPADA, 1, null);
		Vaga vag3 = new Vaga(null, TipoVaga.VAZIA, 2, null);
		Vaga vag4 = new Vaga(null, TipoVaga.VAZIA, 2, null);
		Vaga vag5 = new Vaga(null, TipoVaga.VAZIA, 2, null);
		Vaga vag6 = new Vaga(null, TipoVaga.VAZIA, 2, null);
		Vaga vag7 = new Vaga(null, TipoVaga.VAZIA, 2, null);
		Vaga vag8 = new Vaga(null, TipoVaga.VAZIA, 2, null);
		Vaga vag9 = new Vaga(null, TipoVaga.VAZIA, 2, null);
		Vaga vag10 = new Vaga(null, TipoVaga.VAZIA, 2, null);
		vagaRepository.saveAll(Arrays.asList(vag1, vag2, vag3, vag4, vag5, vag6, vag7, vag8, vag9, vag10));

		Veiculo v1 = new Veiculo(null, cli1, "Monza", "bazo3213", vag2);
		veiculoRepository.saveAll(Arrays.asList(v1));

	}

}