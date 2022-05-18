-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-05-2022 a las 06:29:47
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bddatos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `CEDULA` int(10) UNSIGNED DEFAULT NULL,
  `LUGAR_EXPEDICION` varchar(50) DEFAULT NULL,
  `NOMBRE_COMPLETO` varchar(100) DEFAULT NULL,
  `PROFESION` varchar(50) DEFAULT NULL,
  `DIRECCION_RESIDENCIAL` varchar(100) DEFAULT NULL,
  `CIUDAD` varchar(50) DEFAULT NULL,
  `DEPARTAMENTO` varchar(50) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  `TEL_RESIDENCIA` int(10) UNSIGNED DEFAULT NULL,
  `TEL_TRABAJO` int(10) UNSIGNED DEFAULT NULL,
  `NUM_FACTURA` int(6) UNSIGNED ZEROFILL NOT NULL,
  `FECHA_CREDITO` date DEFAULT NULL,
  `TIPO_CARTERA` varchar(50) DEFAULT NULL,
  `VALOR_CREDITO` double UNSIGNED DEFAULT NULL,
  `NUM_CUOTAS` int(2) UNSIGNED ZEROFILL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seguimiento_clientes`
--

CREATE TABLE `seguimiento_clientes` (
  `ID` int(10) UNSIGNED NOT NULL,
  `CEDULA` int(10) UNSIGNED DEFAULT NULL,
  `LUGAR_EXPEDICION` varchar(50) DEFAULT NULL,
  `NOMBRE_COMPLETO` varchar(100) DEFAULT NULL,
  `PROFESION` varchar(50) DEFAULT NULL,
  `DIRECCION_RESIDENCIAL` varchar(100) DEFAULT NULL,
  `CIUDAD` varchar(50) DEFAULT NULL,
  `DEPARTAMENTO` varchar(50) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  `TEL_RESIDENCIA` int(10) UNSIGNED DEFAULT NULL,
  `TEL_TRABAJO` int(10) UNSIGNED DEFAULT NULL,
  `NUM_FACTURA` int(6) UNSIGNED ZEROFILL NOT NULL,
  `TIPO_CARTERA` varchar(50) DEFAULT NULL,
  `FECHA_MORA` date DEFAULT NULL,
  `DIAS_MORA` int(2) UNSIGNED ZEROFILL DEFAULT NULL,
  `VAL_MORA` double UNSIGNED DEFAULT NULL,
  `V_SEGURO` double UNSIGNED DEFAULT NULL,
  `INTERES_MORA` double UNSIGNED DEFAULT NULL,
  `SALD_RESTANTE` double UNSIGNED DEFAULT NULL,
  `TIPO_COBRO` varchar(50) DEFAULT NULL,
  `FECHA_ACUERDO_UNO` datetime DEFAULT NULL,
  `ACUERDO_UNO` varchar(255) DEFAULT NULL,
  `FECHA_ACUERDO_DOS` datetime DEFAULT NULL,
  `ACUERDO_DOS` varchar(255) DEFAULT NULL,
  `FECHA_ACUERDO_TRES` datetime DEFAULT NULL,
  `ACUERDO_TRES` varchar(255) DEFAULT NULL,
  `FECHA_ACUERDO_CUATRO` datetime DEFAULT NULL,
  `ACUERDO_CUATRO` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbusuarios`
--

CREATE TABLE `tbusuarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `usuario` varchar(50) DEFAULT NULL,
  `psw` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbusuarios`
--

INSERT INTO `tbusuarios` (`id`, `nombre`, `usuario`, `psw`) VALUES
(3, 'Jazmín', 'usuarioMendes', 123),
(5, 'Pedro', 'usuarioMartínez', 1234),
(6, 'Juan', 'usuarioMartínez', 1234),
(7, ' Pedro PErez ', ' usuarioPedro ', 12345),
(8, ' Jazmín Rodríguez Flores ', ' usuarioJaz ', 12345667);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`NUM_FACTURA`);

--
-- Indices de la tabla `seguimiento_clientes`
--
ALTER TABLE `seguimiento_clientes`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `tbusuarios`
--
ALTER TABLE `tbusuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `seguimiento_clientes`
--
ALTER TABLE `seguimiento_clientes`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbusuarios`
--
ALTER TABLE `tbusuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
