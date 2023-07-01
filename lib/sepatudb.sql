-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 01, 2023 at 11:03 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sepatudb`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_bill`
--

CREATE TABLE `tb_bill` (
  `BNum` int(11) DEFAULT NULL,
  `BDate` varchar(40) DEFAULT NULL,
  `CustId` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `amt` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_bill`
--

INSERT INTO `tb_bill` (`BNum`, `BDate`, `CustId`, `uid`, `amt`) VALUES
(0, 'Thu Jun 08 00:00:00 WIB 2023', 11, 1, 1159200000),
(0, 'Thu Jul 06 12:18:05 WIB 2023', 11, 1, 400000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_category`
--

CREATE TABLE `tb_category` (
  `CatId` int(11) NOT NULL,
  `ShoeDesc` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_category`
--

INSERT INTO `tb_category` (`CatId`, `ShoeDesc`) VALUES
(1, 'School Shoes'),
(2, 'Flat Sgoes'),
(3, 'Sport');

-- --------------------------------------------------------

--
-- Table structure for table `tb_customer`
--

CREATE TABLE `tb_customer` (
  `CustId` int(11) NOT NULL,
  `CustName` varchar(50) DEFAULT NULL,
  `CustAdd` varchar(50) DEFAULT NULL,
  `CustPhone` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_customer`
--

INSERT INTO `tb_customer` (`CustId`, `CustName`, `CustAdd`, `CustPhone`) VALUES
(11, 'Ibra', 'lombok', '577'),
(12, 'Adn', 'Rbg', '799');

-- --------------------------------------------------------

--
-- Table structure for table `tb_shoe`
--

CREATE TABLE `tb_shoe` (
  `SId` int(11) NOT NULL,
  `SName` varchar(50) DEFAULT NULL,
  `SCat` int(11) DEFAULT NULL,
  `Sqty` int(11) DEFAULT NULL,
  `Sprice` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_shoe`
--

INSERT INTO `tb_shoe` (`SId`, `SName`, `SCat`, `Sqty`, `Sprice`) VALUES
(1, 'Chanel', 1, 3, 500000),
(2, 'Nike', 1, 80, 80000),
(3, 'Balenciaga', 2, 3, 6000),
(4, 'Ventela', 3, 5, 500000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `UId` int(11) NOT NULL,
  `UName` varchar(50) DEFAULT NULL,
  `UPass` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`UId`, `UName`, `UPass`) VALUES
(1, 'Ibra', '5555'),
(3, 'Adin', '11111');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_bill`
--
ALTER TABLE `tb_bill`
  ADD KEY `CustId` (`CustId`),
  ADD KEY `uid` (`uid`);

--
-- Indexes for table `tb_category`
--
ALTER TABLE `tb_category`
  ADD PRIMARY KEY (`CatId`);

--
-- Indexes for table `tb_customer`
--
ALTER TABLE `tb_customer`
  ADD PRIMARY KEY (`CustId`);

--
-- Indexes for table `tb_shoe`
--
ALTER TABLE `tb_shoe`
  ADD PRIMARY KEY (`SId`),
  ADD KEY `SCat` (`SCat`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`UId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_customer`
--
ALTER TABLE `tb_customer`
  MODIFY `CustId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `tb_shoe`
--
ALTER TABLE `tb_shoe`
  MODIFY `SId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `UId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_bill`
--
ALTER TABLE `tb_bill`
  ADD CONSTRAINT `tb_bill_ibfk_1` FOREIGN KEY (`CustId`) REFERENCES `tb_customer` (`CustId`),
  ADD CONSTRAINT `tb_bill_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `tb_user` (`UId`);

--
-- Constraints for table `tb_shoe`
--
ALTER TABLE `tb_shoe`
  ADD CONSTRAINT `tb_shoe_ibfk_1` FOREIGN KEY (`SCat`) REFERENCES `tb_category` (`CatId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
