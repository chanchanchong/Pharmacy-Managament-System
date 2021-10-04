-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 10, 2021 at 04:58 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pharmacydb`
--
CREATE DATABASE IF NOT EXISTS `pharmacydb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `pharmacydb`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `pass`) VALUES
('admin', '1234'),
('superadmin', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `PHARMAID` int(11) NOT NULL,
  `PHARMNAME` varchar(50) NOT NULL,
  `DESCRIPTION` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `drug`
--

CREATE TABLE `drug` (
  `DRUGID` int(11) NOT NULL,
  `DRUGNAME` varchar(50) NOT NULL,
  `DRUGCATEGORY` varchar(50) NOT NULL,
  `DRUGQUANTITY` int(11) NOT NULL,
  `DRUGPRICE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `drug`
--

INSERT INTO `drug` (`DRUGID`, `DRUGNAME`, `DRUGCATEGORY`, `DRUGQUANTITY`, `DRUGPRICE`) VALUES
(1, 'Neozep', 'Antibacterials', 13, 15);

-- --------------------------------------------------------

--
-- Table structure for table `pharmacist`
--

CREATE TABLE `pharmacist` (
  `PharmaID` int(5) NOT NULL,
  `PharmaName` varchar(50) NOT NULL,
  `PharmaPass` varchar(50) NOT NULL,
  `PharmaGender` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pharmacist`
--

INSERT INTO `pharmacist` (`PharmaID`, `PharmaName`, `PharmaPass`, `PharmaGender`) VALUES
(4, 'MARK', 'MALE', 'MALE'),
(9, 'sdaf', 'dsfsfa', 'MALE'),
(11, 'dfsafdsf', 'fasfssads', 'MALE'),
(15, 'Dataro', 'MALE', 'MALE'),
(123, 'dfsaff', 'sfsdafsda', 'MALE'),
(1321, 'dfafda', 'dsaffas', 'MALE');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`PHARMAID`);

--
-- Indexes for table `drug`
--
ALTER TABLE `drug`
  ADD PRIMARY KEY (`DRUGID`);

--
-- Indexes for table `pharmacist`
--
ALTER TABLE `pharmacist`
  ADD PRIMARY KEY (`PharmaID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `PHARMAID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `drug`
--
ALTER TABLE `drug`
  MODIFY `DRUGID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pharmacist`
--
ALTER TABLE `pharmacist`
  MODIFY `PharmaID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1322;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
