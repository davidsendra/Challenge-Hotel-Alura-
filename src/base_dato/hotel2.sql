-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2023 at 11:14 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel2`
--

-- --------------------------------------------------------

--
-- Table structure for table `huespedes`
--

CREATE TABLE `huespedes` (
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `nacionalidad` varchar(50) NOT NULL,
  `telefono` varchar(35) NOT NULL,
  `id_Reserva` int(10) UNSIGNED NOT NULL,
  `id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `huespedes`
--

INSERT INTO `huespedes` (`nombre`, `apellido`, `fecha_nacimiento`, `nacionalidad`, `telefono`, `id_Reserva`, `id`) VALUES
('Cafu', 'Suarez', '1880-06-05', 'alemán-', '542235874412', 8, 8),
('Tatu', 'Suarez', '1915-06-26', 'uruguayo-uruguaya', '22354877777', 9, 9),
('Nono', 'Jorge', '1676-06-13', 'holandés-holandesa', '44646464666', 10, 10),
('juancito', 'peres', '2022-06-04', 'afgano-afgana', '46464678', 11, 11),
('bigotito', 'dimango', '2022-06-04', 'boliviano-boliviana', '789456123', 12, 12),
('Jorge', 'pizarro', '1990-06-02', 'afgano-afgana', '46464646', 13, 13),
('gatuzo', 'lopes', '2023-06-10', 'afgano-afgana', '4587513131', 14, 14),
('homer', 'simpson', '2023-06-24', 'afgano-afgana', '45789', 15, 15);

-- --------------------------------------------------------

--
-- Table structure for table `reservas`
--

CREATE TABLE `reservas` (
  `id` int(10) UNSIGNED NOT NULL,
  `fecha_entrada` date NOT NULL,
  `fecha_salida` date NOT NULL,
  `valor` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `forma_de_pago` varchar(35) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `reservas`
--

INSERT INTO `reservas` (`id`, `fecha_entrada`, `fecha_salida`, `valor`, `forma_de_pago`) VALUES
(8, '2023-06-03', '2023-06-17', '$168000', 'Tarjeta de Débito'),
(9, '2023-06-03', '2018-06-30', '$-12000', 'Tarjeta de Débito'),
(10, '2032-06-05', '2023-06-10', '$-12000', 'Tarjeta de Débito'),
(11, '2023-06-02', '2023-06-24', '$264000', 'Dinero en efectivo'),
(12, '2054-06-06', '2023-06-03', '$-12000', 'Tarjeta de Débito'),
(13, '2069-06-01', '2023-06-17', '$-12000', 'Dinero en efectivo'),
(14, '2023-06-03', '2023-06-17', '$168000', 'Tarjeta de Crédito'),
(15, '2033-06-04', '2023-06-10', '$-12000', 'Tarjeta de Crédito');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `contrasena` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `contrasena`) VALUES
(1, 'admin', 'admin'),
(2, 'admin', 'admin'),
(3, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `huespedes`
--
ALTER TABLE `huespedes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `huespedes_ibfk_1` (`id_Reserva`);

--
-- Indexes for table `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `huespedes`
--
ALTER TABLE `huespedes`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `reservas`
--
ALTER TABLE `reservas`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `huespedes`
--
ALTER TABLE `huespedes`
  ADD CONSTRAINT `huespedes_ibfk_1` FOREIGN KEY (`id_Reserva`) REFERENCES `reservas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
