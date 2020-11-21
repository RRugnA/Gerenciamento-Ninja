-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Tempo de geração: 21-Nov-2020 às 02:03
-- Versão do servidor: 8.0.18
-- versão do PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `sgmn`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `missions`
--

DROP TABLE IF EXISTS `missions`;
CREATE TABLE IF NOT EXISTS `missions` (
  `mis_id` int(11) NOT NULL AUTO_INCREMENT,
  `mis_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NOT NULL,
  `mis_rank` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NOT NULL,
  `mis_pay` decimal(8,2) NOT NULL,
  `mis_desc` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_cs_0900_ai_ci NOT NULL,
  `mis_team_id` int(11) NOT NULL,
  PRIMARY KEY (`mis_id`),
  KEY `mis_team_id` (`mis_team_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_cs_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `ninjas`
--

DROP TABLE IF EXISTS `ninjas`;
CREATE TABLE IF NOT EXISTS `ninjas` (
  `nja_id` int(11) NOT NULL AUTO_INCREMENT,
  `nja_name` varchar(30) COLLATE utf8mb4_cs_0900_ai_ci NOT NULL,
  `nja_class` varchar(30) COLLATE utf8mb4_cs_0900_ai_ci NOT NULL,
  `nja_team_id` int(11) NOT NULL,
  PRIMARY KEY (`nja_id`),
  KEY `nja_team_id` (`nja_team_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_cs_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `teams`
--

DROP TABLE IF EXISTS `teams`;
CREATE TABLE IF NOT EXISTS `teams` (
  `tea_id` int(11) NOT NULL AUTO_INCREMENT,
  `tea_lider` varchar(30) COLLATE utf8mb4_cs_0900_ai_ci NOT NULL,
  PRIMARY KEY (`tea_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_cs_0900_ai_ci;

--
-- Extraindo dados da tabela `teams`
--

INSERT INTO `teams` (`tea_id`, `tea_lider`) VALUES
(1, 'Kakashi'),
(2, 'Guy'),
(3, 'Kurenai'),
(4, 'Asuma');

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `missions`
--
ALTER TABLE `missions`
  ADD CONSTRAINT `missions_ibfk_1` FOREIGN KEY (`mis_team_id`) REFERENCES `teams` (`tea_id`);

--
-- Limitadores para a tabela `ninjas`
--
ALTER TABLE `ninjas`
  ADD CONSTRAINT `ninjas_ibfk_1` FOREIGN KEY (`nja_team_id`) REFERENCES `teams` (`tea_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
