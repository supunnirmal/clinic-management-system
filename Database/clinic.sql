-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2020 at 10:39 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `clinic`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `Billid` int(10) NOT NULL,
  `Date` date NOT NULL,
  `Payment` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`Billid`, `Date`, `Payment`) VALUES
(72, '2020-01-17', 1010),
(73, '2020-01-17', 1097.5),
(74, '2020-01-17', 1010);

-- --------------------------------------------------------

--
-- Table structure for table `billgen`
--

CREATE TABLE `billgen` (
  `Billid` int(10) NOT NULL,
  `Presid` varchar(20) NOT NULL,
  `Rid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `billgen`
--

INSERT INTO `billgen` (`Billid`, `Presid`, `Rid`) VALUES
(72, '1/2020-01-17', 973343491),
(73, '1/2020-01-17', 973343491),
(74, '1/2020-01-17', 973343491);

-- --------------------------------------------------------

--
-- Table structure for table `billmed`
--

CREATE TABLE `billmed` (
  `Billid` int(10) NOT NULL,
  `Medname` varchar(200) NOT NULL,
  `Amount` int(11) NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `billmed`
--

INSERT INTO `billmed` (`Billid`, `Medname`, `Amount`, `Price`) VALUES
(72, 'Domperidone', 5, 10),
(73, 'Amoxicillin250mg', 5, 87.5),
(73, 'Domperidone', 5, 10),
(74, 'Domperidone', 5, 10);

-- --------------------------------------------------------

--
-- Table structure for table `complain`
--

CREATE TABLE `complain` (
  `Comid` int(10) NOT NULL,
  `Date` date NOT NULL,
  `ComDescription` varchar(5000) NOT NULL,
  `Billid` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `complain`
--

INSERT INTO `complain` (`Comid`, `Date`, `ComDescription`, `Billid`) VALUES
(4, '2020-01-17', 'doctor is not concerned', 72);

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `Did` int(11) NOT NULL,
  `Specialization` text DEFAULT NULL,
  `Wplace` text DEFAULT NULL,
  `ChnFee` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`Did`, `Specialization`, `Wplace`, `ChnFee`) VALUES
(973032852, 'Nuero', 'Nawaloka', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Id` int(11) NOT NULL,
  `Role` char(1) NOT NULL,
  `Fname` text NOT NULL,
  `Lname` text NOT NULL,
  `Address` text NOT NULL,
  `DOB` date NOT NULL,
  `Username` text NOT NULL,
  `Password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Id`, `Role`, `Fname`, `Lname`, `Address`, `DOB`, `Username`, `Password`) VALUES
(904007751, 'A', 'Kamal', 'Gunerathna', 'Gothatuwa\r\nAngoda', '1990-02-01', 'KamalGunerathna', '904007751'),
(973032852, 'D', 'Malisha', 'Gamage', '395/7/1,gothatuwa,angoda', '1997-10-29', 'MalishaGamage', '973032852'),
(973343491, 'R', 'Supun', 'Nirmal', '160,kalukondayawa,malwana', '1980-02-12', 'SupunNirmal', '973343491');

-- --------------------------------------------------------

--
-- Table structure for table `medicine`
--

CREATE TABLE `medicine` (
  `Medname` varchar(200) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` float NOT NULL,
  `MedDescription` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medicine`
--

INSERT INTO `medicine` (`Medname`, `Quantity`, `Price`, `MedDescription`) VALUES
('Amoxicillin250mg', 0, 17.5, 'after'),
('Amoxicillin500mg', 25, 20, 'after'),
('Deriphyllin', 100, 3, 'after'),
('Dexa', 100, 1, 'after'),
('Domperidone', 0, 2, 'before'),
('Loratadin', 1, 10, 'after'),
('Piriton', 100, 1, 'after'),
('Rantidine', 10, 3, 'before'),
('Salbutamol', 100, 2, 'after');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `Pid` int(11) NOT NULL,
  `Name` text NOT NULL,
  `DOB` date NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `Address` text DEFAULT NULL,
  `Email` text DEFAULT NULL,
  `SpNotes` varchar(5000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`Pid`, `Name`, `DOB`, `Gender`, `Address`, `Email`, `SpNotes`) VALUES
(1254, 'Aloka', '1997-11-18', 'F', '150/6,wellawediya,gonawala', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `prescription`
--

CREATE TABLE `prescription` (
  `Presid` varchar(20) NOT NULL,
  `Date` date NOT NULL,
  `No` int(11) NOT NULL,
  `Tests` varchar(5000) DEFAULT NULL,
  `Pid` int(11) NOT NULL,
  `Did` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prescription`
--

INSERT INTO `prescription` (`Presid`, `Date`, `No`, `Tests`, `Pid`, `Did`) VALUES
('1/2020-01-17', '2020-01-17', 1, '', 1254, 973032852);

-- --------------------------------------------------------

--
-- Table structure for table `presmed`
--

CREATE TABLE `presmed` (
  `Presid` varchar(20) NOT NULL,
  `Medname` varchar(200) NOT NULL,
  `Times` varchar(5) NOT NULL,
  `Days` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `presmed`
--

INSERT INTO `presmed` (`Presid`, `Medname`, `Times`, `Days`) VALUES
('1/2020-01-17', 'Amoxicillin250mg', 'OD HS', 5),
('1/2020-01-17', 'Domperidone', 'OD', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`Billid`);

--
-- Indexes for table `billgen`
--
ALTER TABLE `billgen`
  ADD PRIMARY KEY (`Billid`,`Presid`,`Rid`),
  ADD KEY `fkPresidBillgen` (`Presid`),
  ADD KEY `fkRidBilgen` (`Rid`);

--
-- Indexes for table `billmed`
--
ALTER TABLE `billmed`
  ADD PRIMARY KEY (`Billid`,`Medname`),
  ADD KEY `fkMednameMedicine` (`Medname`);

--
-- Indexes for table `complain`
--
ALTER TABLE `complain`
  ADD PRIMARY KEY (`Comid`),
  ADD KEY `fkBillidComplain` (`Billid`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`Did`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `medicine`
--
ALTER TABLE `medicine`
  ADD PRIMARY KEY (`Medname`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`Pid`);

--
-- Indexes for table `prescription`
--
ALTER TABLE `prescription`
  ADD PRIMARY KEY (`Presid`),
  ADD KEY `fkPidPres` (`Pid`),
  ADD KEY `fkDidPres` (`Did`);

--
-- Indexes for table `presmed`
--
ALTER TABLE `presmed`
  ADD PRIMARY KEY (`Presid`,`Medname`),
  ADD KEY `fkMednamePresmed` (`Medname`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bill`
--
ALTER TABLE `bill`
  MODIFY `Billid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=75;

--
-- AUTO_INCREMENT for table `complain`
--
ALTER TABLE `complain`
  MODIFY `Comid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `Pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1255;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `billgen`
--
ALTER TABLE `billgen`
  ADD CONSTRAINT `fkBillidBillgen` FOREIGN KEY (`Billid`) REFERENCES `bill` (`Billid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fkPresidBillgen` FOREIGN KEY (`Presid`) REFERENCES `prescription` (`Presid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fkRidBilgen` FOREIGN KEY (`Rid`) REFERENCES `employee` (`Id`);

--
-- Constraints for table `billmed`
--
ALTER TABLE `billmed`
  ADD CONSTRAINT `fkBillidBillmed` FOREIGN KEY (`Billid`) REFERENCES `bill` (`Billid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fkMednameMedicine` FOREIGN KEY (`Medname`) REFERENCES `medicine` (`Medname`);

--
-- Constraints for table `complain`
--
ALTER TABLE `complain`
  ADD CONSTRAINT `fkBillidComplain` FOREIGN KEY (`Billid`) REFERENCES `bill` (`Billid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `doctor`
--
ALTER TABLE `doctor`
  ADD CONSTRAINT `fkDid` FOREIGN KEY (`Did`) REFERENCES `employee` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `prescription`
--
ALTER TABLE `prescription`
  ADD CONSTRAINT `fkDidPres` FOREIGN KEY (`Did`) REFERENCES `doctor` (`Did`),
  ADD CONSTRAINT `fkPidPres` FOREIGN KEY (`Pid`) REFERENCES `patient` (`Pid`);

--
-- Constraints for table `presmed`
--
ALTER TABLE `presmed`
  ADD CONSTRAINT `fkMednamePresmed` FOREIGN KEY (`Medname`) REFERENCES `medicine` (`Medname`),
  ADD CONSTRAINT `fkPresidPresmed` FOREIGN KEY (`Presid`) REFERENCES `prescription` (`Presid`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
