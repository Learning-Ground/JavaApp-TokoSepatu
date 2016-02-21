-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 21, 2016 at 07:38 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `penjualansepatu`
--
CREATE DATABASE IF NOT EXISTS `penjualansepatu` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `penjualansepatu`;

-- --------------------------------------------------------

--
-- Table structure for table `tb_sepatu_supplier`
--

CREATE TABLE IF NOT EXISTS `tb_sepatu_supplier` (
  `id` varchar(50) NOT NULL,
  `id_supplier` varchar(50) NOT NULL,
  `id_sepatu` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_sepatu_supplier`
--

INSERT INTO `tb_sepatu_supplier` (`id`, `id_supplier`, `id_sepatu`) VALUES
('055256d8-0482-4284-a4de-5e531c04e80d', '583293bb-f079-4455-9254-7b8f20c7e547', '9f79ce82-63f8-49f4-858a-3ebeecd0a9fc'),
('7a295f8d-d357-4db4-ad4e-ac8ef9c0e55b', '583293bb-f079-4455-9254-7b8f20c7e547', '51b7ebd0-1805-451a-bde5-cc4a518e54c6'),
('85426663-dac2-4821-9a06-a837786e898d', '583293bb-f079-4455-9254-7b8f20c7e547', 'ae243a15-e090-4fe0-8e39-fff67f967e46');

-- --------------------------------------------------------

--
-- Table structure for table `tbsepatu`
--

CREATE TABLE IF NOT EXISTS `tbsepatu` (
  `id_sepatu` varchar(50) NOT NULL,
  `nama_sepatu` varchar(50) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  PRIMARY KEY (`id_sepatu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbsepatu`
--

INSERT INTO `tbsepatu` (`id_sepatu`, `nama_sepatu`, `jenis`) VALUES
('51b7ebd0-1805-451a-bde5-cc4a518e54c6', 'stink-02', 'Olahraga'),
('9f79ce82-63f8-49f4-858a-3ebeecd0a9fc', 'stink-01', 'Olahraga'),
('ae243a15-e090-4fe0-8e39-fff67f967e46', 'stinker-extra', 'Olahraga');

-- --------------------------------------------------------

--
-- Table structure for table `tbsupplier`
--

CREATE TABLE IF NOT EXISTS `tbsupplier` (
  `id_supplier` varchar(50) NOT NULL,
  `nama_supplier` varchar(50) NOT NULL,
  PRIMARY KEY (`id_supplier`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbsupplier`
--

INSERT INTO `tbsupplier` (`id_supplier`, `nama_supplier`) VALUES
('3f58eb54-458f-40e5-94e4-4cd2e4e9489f', 'NewGen'),
('583293bb-f079-4455-9254-7b8f20c7e547', 'Dirt'),
('cf594802-1a6f-4d5c-b06d-67f10fe0e4ca', 'Loggy');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
