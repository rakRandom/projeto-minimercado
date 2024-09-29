-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `minimercado`
--
CREATE DATABASE IF NOT EXISTS `minimercado` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `minimercado`;

-- --------------------------------------------------------

--
-- Estrutura para tabela `cargo`
--

CREATE TABLE `cargo` (
  `cod_cargo` int(10) UNSIGNED NOT NULL,
  `descricao` varchar(64) NOT NULL,
  `salario` decimal(20,5) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `categoria`
--

CREATE TABLE `categoria` (
  `cod_cate` int(11) UNSIGNED NOT NULL,
  `cod_promo_cate` int(11) UNSIGNED NOT NULL,
  `descricao` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `classificacao`
--

CREATE TABLE `classificacao` (
  `cod_classific` int(10) UNSIGNED NOT NULL,
  `descricao` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(10) UNSIGNED NOT NULL,
  `nome_cli` varchar(64) NOT NULL,
  `data_nasc` date NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `rg` varchar(12) NOT NULL,
  `endereco` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `compra`
--

CREATE TABLE `compra` (
  `cod_compra` int(11) UNSIGNED NOT NULL,
  `id_func` int(11) UNSIGNED NOT NULL,
  `id_cliente` int(11) UNSIGNED NOT NULL,
  `data_compra` datetime NOT NULL,
  `metodo_pag` int(11) UNSIGNED NOT NULL,
  `preco_bruto` decimal(20,5) UNSIGNED NOT NULL,
  `valor_desconto` decimal(20,5) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `credenciais`
--

CREATE TABLE `credenciais` (
  `usuario` varchar(64) NOT NULL,
  `senha` varchar(64) NOT NULL,
  `cod_acesso` int(11) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `credenciais`
--

INSERT INTO `credenciais` (`usuario`, `senha`, `cod_acesso`) VALUES
('admin', '1234', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `expediente`
--

CREATE TABLE `expediente` (
  `cod_expediente` int(10) UNSIGNED NOT NULL,
  `hora_inicio` time NOT NULL,
  `hora_fim` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `fabricante`
--

CREATE TABLE `fabricante` (
  `id_fabric` int(10) UNSIGNED NOT NULL,
  `nome_fabric` varchar(60) NOT NULL,
  `email` varchar(256) NOT NULL,
  `cnpj` varchar(18) NOT NULL,
  `website_url` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_func` int(10) UNSIGNED NOT NULL,
  `nome_func` varchar(64) NOT NULL,
  `data_nasc` date NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `rg` varchar(12) NOT NULL,
  `endereco` varchar(128) NOT NULL,
  `cod_cargo` int(10) UNSIGNED NOT NULL,
  `cod_expediente` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `itens`
--

CREATE TABLE `itens` (
  `cod_lote` int(11) UNSIGNED NOT NULL,
  `cod_compra` int(11) UNSIGNED NOT NULL,
  `quantidade` int(11) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `lote`
--

CREATE TABLE `lote` (
  `cod_lote` int(10) UNSIGNED NOT NULL,
  `cod_prod` int(10) UNSIGNED NOT NULL,
  `data_validade` date NOT NULL,
  `data_compra` date NOT NULL,
  `quantidade` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `metodo_pagamento`
--

CREATE TABLE `metodo_pagamento` (
  `cod_pagamento` int(11) UNSIGNED NOT NULL,
  `descricao` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `nivel_acesso`
--

CREATE TABLE `nivel_acesso` (
  `cod_nivel` int(10) UNSIGNED NOT NULL,
  `descricao` varchar(24) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `nivel_acesso`
--

INSERT INTO `nivel_acesso` (`cod_nivel`, `descricao`) VALUES
(1, 'admin');

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `cod_prod` int(10) UNSIGNED NOT NULL,
  `cod_cate` int(10) UNSIGNED NOT NULL,
  `cod_promo_prod` int(10) UNSIGNED NOT NULL,
  `cod_classific` int(10) UNSIGNED NOT NULL,
  `id_fabric` int(10) UNSIGNED NOT NULL,
  `nome` varchar(30) NOT NULL,
  `descricao` varchar(60) DEFAULT NULL,
  `estoque` int(10) UNSIGNED NOT NULL,
  `preco` decimal(20,5) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `promocao_categoria`
--

CREATE TABLE `promocao_categoria` (
  `cod_promo_cate` int(10) UNSIGNED NOT NULL,
  `porcentagem` decimal(10,5) NOT NULL,
  `data_inicio` date NOT NULL,
  `data_termino` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `promocao_produto`
--

CREATE TABLE `promocao_produto` (
  `cod_promo_prod` int(10) UNSIGNED NOT NULL,
  `porcentagem` decimal(10,5) NOT NULL,
  `data_inicio` date NOT NULL,
  `data_termino` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `telefone`
--

CREATE TABLE `telefone` (
  `id_dono` int(10) UNSIGNED NOT NULL,
  `tipo_tel` int(10) UNSIGNED NOT NULL,
  `tipo_dono` varchar(32) NOT NULL,
  `telefone` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `tipo_telefone`
--

CREATE TABLE `tipo_telefone` (
  `id_tipo` int(10) UNSIGNED NOT NULL,
  `descricao` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`cod_cargo`);

--
-- Índices de tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`cod_cate`);

--
-- Índices de tabela `classificacao`
--
ALTER TABLE `classificacao`
  ADD PRIMARY KEY (`cod_classific`);

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices de tabela `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`cod_compra`);

--
-- Índices de tabela `credenciais`
--
ALTER TABLE `credenciais`
  ADD UNIQUE KEY `usuario` (`usuario`),
  ADD KEY `cod_acesso` (`cod_acesso`);

--
-- Índices de tabela `expediente`
--
ALTER TABLE `expediente`
  ADD PRIMARY KEY (`cod_expediente`);

--
-- Índices de tabela `fabricante`
--
ALTER TABLE `fabricante`
  ADD PRIMARY KEY (`id_fabric`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_func`);

--
-- Índices de tabela `lote`
--
ALTER TABLE `lote`
  ADD PRIMARY KEY (`cod_lote`);

--
-- Índices de tabela `metodo_pagamento`
--
ALTER TABLE `metodo_pagamento`
  ADD PRIMARY KEY (`cod_pagamento`);

--
-- Índices de tabela `nivel_acesso`
--
ALTER TABLE `nivel_acesso`
  ADD PRIMARY KEY (`cod_nivel`);

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`cod_prod`);

--
-- Índices de tabela `promocao_categoria`
--
ALTER TABLE `promocao_categoria`
  ADD PRIMARY KEY (`cod_promo_cate`);

--
-- Índices de tabela `promocao_produto`
--
ALTER TABLE `promocao_produto`
  ADD PRIMARY KEY (`cod_promo_prod`);

--
-- Índices de tabela `tipo_telefone`
--
ALTER TABLE `tipo_telefone`
  ADD PRIMARY KEY (`id_tipo`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cargo`
--
ALTER TABLE `cargo`
  MODIFY `cod_cargo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `cod_cate` int(11) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `classificacao`
--
ALTER TABLE `classificacao`
  MODIFY `cod_classific` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `compra`
--
ALTER TABLE `compra`
  MODIFY `cod_compra` int(11) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `expediente`
--
ALTER TABLE `expediente`
  MODIFY `cod_expediente` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `fabricante`
--
ALTER TABLE `fabricante`
  MODIFY `id_fabric` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_func` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `lote`
--
ALTER TABLE `lote`
  MODIFY `cod_lote` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `metodo_pagamento`
--
ALTER TABLE `metodo_pagamento`
  MODIFY `cod_pagamento` int(11) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `nivel_acesso`
--
ALTER TABLE `nivel_acesso`
  MODIFY `cod_nivel` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `cod_prod` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `promocao_categoria`
--
ALTER TABLE `promocao_categoria`
  MODIFY `cod_promo_cate` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `promocao_produto`
--
ALTER TABLE `promocao_produto`
  MODIFY `cod_promo_prod` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tipo_telefone`
--
ALTER TABLE `tipo_telefone`
  MODIFY `id_tipo` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `credenciais`
--
ALTER TABLE `credenciais`
  ADD CONSTRAINT `credenciais_ibfk_1` FOREIGN KEY (`cod_acesso`) REFERENCES `nivel_acesso` (`cod_nivel`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
