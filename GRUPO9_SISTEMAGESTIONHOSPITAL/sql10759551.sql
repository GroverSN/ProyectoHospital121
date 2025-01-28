-- phpMyAdmin SQL Dump
-- version 4.7.1
-- https://www.phpmyadmin.net/
--
-- Servidor: sql10.freesqldatabase.com
-- Tiempo de generación: 28-01-2025 a las 19:36:32
-- Versión del servidor: 5.5.62-0ubuntu0.14.04.1
-- Versión de PHP: 7.0.33-0ubuntu0.16.04.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sql10759551`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `tipo` varchar(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `equipoEspecializado` tinyint(1) NOT NULL,
  `idHospital` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `tipo`, `capacidad`, `equipoEspecializado`, `idHospital`) VALUES
(1, 'SEmergencia', 22, 0, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hospital`
--

CREATE TABLE `hospital` (
  `nombreHospital` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hospital`
--

INSERT INTO `hospital` (`nombreHospital`, `direccion`) VALUES
('Hospital del Norte', 'av integracion 1243 quebrada San Jorge'),
('Hospital La Paz', 'av. SierraDeviña 2342'),
('Hospital del Norte', 'Av. Civica'),
('Hospital Boliviano Holandes', 'Av. Satelite'),
('Hospital del sur', 'Av.Panamericana'),
('Hospital del niño', 'av. costanera'),
('Salvador', 'Cementerio'),
('qqqq', 'qqqq'),
('123', '123'),
('San Jose', 'Av. Arce');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamento`
--

CREATE TABLE `medicamento` (
  `nombre` varchar(255) NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `costo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medicamento`
--

INSERT INTO `medicamento` (`nombre`, `tipo`, `cantidad`, `costo`) VALUES
('Paracetamol', 'Analgésico y antipirético', 50, 25.43),
('Paracetamol', 'Analgésico y antipirético', 50, 25.43),
('paracetalgil', 'medicamento cor', 20, 4),
('paracetamol', 'analgesico', 5, 6),
('qqqq', 'qqq', 2, 23);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `diagnostico` varchar(200) NOT NULL,
  `fechaIngreso` varchar(200) NOT NULL,
  `estadoClinico` varchar(200) NOT NULL,
  `nroHabitacion` int(11) NOT NULL,
  `nroCamilla` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `edad` int(11) NOT NULL,
  `genero` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`diagnostico`, `fechaIngreso`, `estadoClinico`, `nroHabitacion`, `nroCamilla`, `nombre`, `edad`, `genero`) VALUES
('', '2025-01-10\"', 'Estable', 302, 14, 'María Fernández', 32, 'Femenino'),
('Neumonía aguda', '2025-01-10\"', 'Estable', 302, 14, 'María Fernández', 32, 'Femenino'),
('', '', '', 2, 0, '', 0, ''),
('Revision', 'Masculino', 'Gastritis', 3, 3, 'Alejandro', 36, '15/11/2024'),
('Estable', 'No binario', 'Miope', 123, 321, 'Pepito', 50, '28/01/2025'),
('estable', 'pppp', 'fractura', 4, 4, 'ppppp', 11, '2025-03-05'),
('estable', 'masculino', 'Fractura', 5, 13, 'CArlos', 4, '2025-03-05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE `personal` (
  `nombre` varchar(200) NOT NULL,
  `edad` int(11) NOT NULL,
  `genero` varchar(200) NOT NULL,
  `turno` varchar(200) NOT NULL,
  `cargo` varchar(200) NOT NULL,
  `sueldo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`nombre`, `edad`, `genero`, `turno`, `cargo`, `sueldo`) VALUES
('Dr. Juan Pérez', 45, 'Masculino', 'Mañana', 'Médico Cirujano', 3500),
('Marco', 35, 'Masculino', 'Mañana', 'Secretario', 3500),
('Maria', 29, 'Femenino', 'Noche', 'Enfermera', 3800),
('Fabricio', 29, 'Masculino', 'Noche', 'Enfermero', 3800),
('Demetrio ', 40, 'Masculino', 'Noche', 'Doctor', 6500),
('ariel', 30, 'masculinno', 'tarde', 'doctor', 5000),
('aadad', 3, 'awdad', 'adwaw', 'awawd', 23);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
