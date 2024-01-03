-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2024 at 09:19 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stock_barang`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`category_id`, `category_name`) VALUES
(2, 'Minuman'),
(3, 'Snack'),
(6, 'Peralatan'),
(7, 'coba');

-- --------------------------------------------------------

--
-- Table structure for table `export`
--

CREATE TABLE `export` (
  `export_id` int(11) NOT NULL,
  `export_desc` text NOT NULL,
  `export_date` date NOT NULL,
  `export_stock_all` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `export`
--

INSERT INTO `export` (`export_id`, `export_desc`, `export_date`, `export_stock_all`) VALUES
(1, 'export pertama', '2023-12-30', '300'),
(2, 'export kedua', '2023-12-31', '250');

-- --------------------------------------------------------

--
-- Table structure for table `export_items`
--

CREATE TABLE `export_items` (
  `export_items_id` int(11) NOT NULL,
  `export_items_export_id` int(11) NOT NULL,
  `export_items_items_id` int(11) NOT NULL,
  `export_items_category_id` int(11) NOT NULL,
  `export_items_place_id` int(11) NOT NULL,
  `export_items_stock` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `export_items`
--

INSERT INTO `export_items` (`export_items_id`, `export_items_export_id`, `export_items_items_id`, `export_items_category_id`, `export_items_place_id`, `export_items_stock`) VALUES
(1, 1, 8, 2, 22, '200'),
(2, 1, 7, 2, 1, '100'),
(3, 2, 15, 3, 1, '100'),
(4, 2, 6, 7, 22, '150'),
(5, 1, 7, 7, 1, '200'),
(6, 1, 7, 2, 1, '100'),
(7, 2, 15, 3, 1, '100'),
(8, 1, 6, 2, 22, '150');

-- --------------------------------------------------------

--
-- Table structure for table `import`
--

CREATE TABLE `import` (
  `import_id` int(11) NOT NULL,
  `import_desc` text NOT NULL,
  `import_date` date NOT NULL,
  `import_stock_all` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `import`
--

INSERT INTO `import` (`import_id`, `import_desc`, `import_date`, `import_stock_all`) VALUES
(1, 'import pertama', '2023-12-22', '200'),
(2, 'import ke dua', '2023-12-30', '150');

-- --------------------------------------------------------

--
-- Table structure for table `import_items`
--

CREATE TABLE `import_items` (
  `import_items_id` int(11) NOT NULL,
  `import_items_import_id` int(11) NOT NULL,
  `import_items_items_id` int(11) NOT NULL,
  `import_items_category_id` int(11) NOT NULL,
  `import_items_place_id` int(11) NOT NULL,
  `import_items_stock` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `import_items`
--

INSERT INTO `import_items` (`import_items_id`, `import_items_import_id`, `import_items_items_id`, `import_items_category_id`, `import_items_place_id`, `import_items_stock`) VALUES
(1, 1, 7, 2, 1, '50'),
(2, 1, 8, 6, 22, '50'),
(3, 1, 15, 3, 1, '100'),
(4, 2, 15, 6, 22, '50'),
(5, 2, 7, 6, 22, '50'),
(6, 2, 6, 3, 1, '50');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `items_id` int(11) NOT NULL,
  `items_category_id` int(11) NOT NULL,
  `items_place_id` int(11) NOT NULL,
  `items_name` varchar(55) NOT NULL,
  `items_price` varchar(20) NOT NULL,
  `items_stock` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`items_id`, `items_category_id`, `items_place_id`, `items_name`, `items_price`, `items_stock`) VALUES
(6, 1, 1, 'produk enam', '2500', '322'),
(7, 1, 1, 'produk tujuh', '2000', '111'),
(8, 1, 1, 'produk delapan', '3500', '322'),
(15, 1, 1, 'kjghsdrg', '2000', '34123');

-- --------------------------------------------------------

--
-- Table structure for table `place`
--

CREATE TABLE `place` (
  `place_id` int(11) NOT NULL,
  `place_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `place`
--

INSERT INTO `place` (`place_id`, `place_name`) VALUES
(1, 'GD1'),
(22, 'GD2');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `users_id` int(11) NOT NULL,
  `role` int(11) NOT NULL COMMENT '1 = admin, 0 = user',
  `users_name` varchar(55) NOT NULL,
  `users_password` varchar(55) NOT NULL,
  `users_email` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`users_id`, `role`, `users_name`, `users_password`, `users_email`) VALUES
(1, 1, 'Azka Ainurridho', 'azka123', 'azkaainurridho@gmail.com'),
(2, 0, 'Muhammad asep', 'asep123', 'mohasep@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `export`
--
ALTER TABLE `export`
  ADD PRIMARY KEY (`export_id`);

--
-- Indexes for table `export_items`
--
ALTER TABLE `export_items`
  ADD PRIMARY KEY (`export_items_id`);

--
-- Indexes for table `import`
--
ALTER TABLE `import`
  ADD PRIMARY KEY (`import_id`);

--
-- Indexes for table `import_items`
--
ALTER TABLE `import_items`
  ADD PRIMARY KEY (`import_items_id`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`items_id`);

--
-- Indexes for table `place`
--
ALTER TABLE `place`
  ADD PRIMARY KEY (`place_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`users_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `export`
--
ALTER TABLE `export`
  MODIFY `export_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `export_items`
--
ALTER TABLE `export_items`
  MODIFY `export_items_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `import`
--
ALTER TABLE `import`
  MODIFY `import_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `import_items`
--
ALTER TABLE `import_items`
  MODIFY `import_items_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `items_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `place`
--
ALTER TABLE `place`
  MODIFY `place_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `users_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
