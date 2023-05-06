-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 10-03-2023 a las 16:32:16
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `argprograma`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `domicilio`
--

DROP TABLE IF EXISTS `domicilio`;
CREATE TABLE IF NOT EXISTS `domicilio` (
  `id` int NOT NULL,
  `barrio` varchar(45) DEFAULT NULL,
  `calle` varchar(45) DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `block` varchar(20) DEFAULT NULL,
  `departamento` varchar(20) DEFAULT NULL,
  `persona_id` int NOT NULL,
  PRIMARY KEY (`id`,`persona_id`),
  KEY `fk_domicilio_persona1_idx` (`persona_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `domicilio`
--

INSERT INTO `domicilio` (`id`, `barrio`, `calle`, `numero`, `block`, `departamento`, `persona_id`) VALUES
(1, 'Lujan', 'Lavalle', 456, '', '', 1),
(2, 'Pizarro', 'Junin', 912, 'G', '16', 2),
(3, 'Palermo', 'Guemes', 56, '', '', 3),
(4, 'San Telmo', 'Belgrano', 746, '14', 'H', 4),
(5, 'Milagro', 'Urquiza', 158, '', '', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion`
--

DROP TABLE IF EXISTS `educacion`;
CREATE TABLE IF NOT EXISTS `educacion` (
  `id` int NOT NULL,
  `secundario` tinyint DEFAULT NULL,
  `establecimiento` varchar(45) DEFAULT NULL,
  `universitario` tinyint DEFAULT NULL,
  `completo` tinyint DEFAULT NULL,
  `institucion` varchar(45) DEFAULT NULL,
  `persona_id` int NOT NULL,
  PRIMARY KEY (`id`,`persona_id`),
  KEY `fk_educacion_persona1_idx` (`persona_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `educacion`
--

INSERT INTO `educacion` (`id`, `secundario`, `establecimiento`, `universitario`, `completo`, `institucion`, `persona_id`) VALUES
(1, 1, 'Salesiano', 1, 0, 'UNSa', 1),
(2, 1, 'Belgrano', 1, 1, 'Catolica', 2),
(3, 1, 'Uzzi', 1, 1, 'Siglo 21', 3),
(4, 1, 'San Pablo', 1, 0, 'UBA', 4),
(5, 1, 'Normal', 1, 0, 'UNaM', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencia_laboral`
--

DROP TABLE IF EXISTS `experiencia_laboral`;
CREATE TABLE IF NOT EXISTS `experiencia_laboral` (
  `id` int NOT NULL,
  `nombreEmpresa` varchar(45) DEFAULT NULL,
  `trabajoActual` tinyint DEFAULT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `persona_id` int NOT NULL,
  `tipo_empleo_id` int NOT NULL,
  PRIMARY KEY (`id`,`persona_id`,`tipo_empleo_id`),
  KEY `fk_experiencia_laboral_persona_idx` (`persona_id`),
  KEY `fk_experiencia_laboral_tipo_empleo1_idx` (`tipo_empleo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `experiencia_laboral`
--

INSERT INTO `experiencia_laboral` (`id`, `nombreEmpresa`, `trabajoActual`, `fechaInicio`, `fechaFin`, `descripcion`, `persona_id`, `tipo_empleo_id`) VALUES
(1, 'Catito y lio', 1, '2017-05-23', '0000-00-00', 'Animadora de fiestas infantiles', 1, 3),
(2, 'Batucada los intocables', 1, '2017-10-02', '0000-00-00', 'Animadora de fiestas', 1, 3),
(3, 'CIMNEIBER', 0, '2022-08-04', '2022-12-30', 'Tutora', 1, 1),
(4, 'Neoris', 0, '2020-10-15', '2021-10-15', 'Pasantia en Sistemas', 2, 1),
(5, 'Aguas del Norte', 1, '2021-09-29', '0000-00-00', 'Encargado del Area de Informatica', 2, 2),
(6, 'Ingenieros SA', 1, '2020-10-10', '0000-00-00', 'Encargada del control de obra', 3, 1),
(7, 'Muebles Aye', 1, '2018-01-07', '0000-00-00', 'Creadora de la empresa', 3, 3),
(8, 'Mycrosoft', 0, '2022-04-27', '2022-10-19', 'Pasantia en el area de informatica', 4, 4),
(9, 'ABC', 0, '2021-08-23', '2022-04-21', 'Pasantia en el area de informatica', 4, 4),
(10, 'Frutas SA', 0, '2020-09-16', '2021-10-20', 'Transportista', 5, 5),
(11, 'Verduras SA', 0, '2021-03-21', '2023-02-14', 'Repositor de stock', 5, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
  `id` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `fechaNac` date DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `correo` varchar(20) DEFAULT NULL,
  `sobre_mi` varchar(45) DEFAULT NULL,
  `url_foto` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `nombre`, `apellido`, `fechaNac`, `telefono`, `correo`, `sobre_mi`, `url_foto`) VALUES
(1, 'Tatiana', 'Velasquez', '1999-02-23', '3874234870', 'tati@gmail.com', 'Estudiante de Administracion de Empresas', 'https://raw.githubusercontent.com/MTEVQ/Codig'),
(2, 'Damian', 'Perez', '1997-06-20', '3877298641', 'dami@gmail.com', 'Ingeniero en Sistemas', 'https://img.freepik.com/fotos-premium/chico-a'),
(3, 'Ayelen', 'Solan', '1995-12-11', '3875007212', 'ayesol@gmail.com', 'Arquitecta y emprendedora', 'https://img.freepik.com/foto-gratis/retrato-h'),
(4, 'Maria', 'Quipildor', '2000-07-06', '3876480255', 'quipildorm@gmail.com', 'Estudiante de Informatica', 'https://img.freepik.com/foto-gratis/mujer-her'),
(5, 'Jose', 'Gutierrez', '2001-12-25', '3874239741', 'josiguti@gmail.com', 'Estudiante de Agronomia', 'https://img.freepik.com/fotos-premium/foto-es');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyectos`
--

DROP TABLE IF EXISTS `proyectos`;
CREATE TABLE IF NOT EXISTS `proyectos` (
  `id` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `tecnologias_id` int NOT NULL,
  `usuarios_id` int NOT NULL,
  PRIMARY KEY (`id`,`tecnologias_id`,`usuarios_id`),
  KEY `fk_proyectos_tecnologias1_idx` (`tecnologias_id`),
  KEY `fk_proyectos_usuarios1_idx` (`usuarios_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `proyectos`
--

INSERT INTO `proyectos` (`id`, `nombre`, `tecnologias_id`, `usuarios_id`) VALUES
(1, 'Cinemar', 1, 1),
(2, 'Supermarck', 1, 1),
(3, 'SaltaPlus', 2, 2),
(4, 'July', 2, 2),
(5, 'BD Yo', 3, 3),
(6, 'App Aye', 2, 3),
(7, 'Sonar', 4, 4),
(8, 'Free Shop', 1, 4),
(9, 'SAETA', 2, 5),
(10, 'Mi solucion', 6, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnologias`
--

DROP TABLE IF EXISTS `tecnologias`;
CREATE TABLE IF NOT EXISTS `tecnologias` (
  `id` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `tecnologias`
--

INSERT INTO `tecnologias` (`id`, `nombre`) VALUES
(1, 'Desarrollo Web'),
(2, 'Desarrollo Movil'),
(3, 'Base de Datos'),
(4, 'Aplicaciones Multiplataforma'),
(5, 'Soluciones Cloud'),
(6, 'Soluciones Empresariales');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_empleo`
--

DROP TABLE IF EXISTS `tipo_empleo`;
CREATE TABLE IF NOT EXISTS `tipo_empleo` (
  `id` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `tipo_empleo`
--

INSERT INTO `tipo_empleo` (`id`, `nombre`) VALUES
(1, 'Part Time'),
(2, 'Full Time'),
(3, 'Freelance/Emprendimiento'),
(4, 'Monotributista'),
(5, 'Informal');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `contraseña` varchar(20) DEFAULT NULL,
  `persona_id` int NOT NULL,
  PRIMARY KEY (`id`,`persona_id`),
  KEY `fk_usuarios_persona1_idx` (`persona_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `contraseña`, `persona_id`) VALUES
(1, 'Tati09', '1234qwer', 1),
(2, 'Perez54', '0987poiu', 2),
(3, 'Solan12', 'qwer2345', 3),
(4, 'Mar87ia', 'asdf567', 4),
(5, '88Jose', '1209tu', 5);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `domicilio`
--
ALTER TABLE `domicilio`
  ADD CONSTRAINT `fk_domicilio_persona1` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`);

--
-- Filtros para la tabla `educacion`
--
ALTER TABLE `educacion`
  ADD CONSTRAINT `fk_educacion_persona1` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`);

--
-- Filtros para la tabla `experiencia_laboral`
--
ALTER TABLE `experiencia_laboral`
  ADD CONSTRAINT `fk_experiencia_laboral_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  ADD CONSTRAINT `fk_experiencia_laboral_tipo_empleo1` FOREIGN KEY (`tipo_empleo_id`) REFERENCES `tipo_empleo` (`id`);

--
-- Filtros para la tabla `proyectos`
--
ALTER TABLE `proyectos`
  ADD CONSTRAINT `fk_proyectos_tecnologias1` FOREIGN KEY (`tecnologias_id`) REFERENCES `tecnologias` (`id`),
  ADD CONSTRAINT `fk_proyectos_usuarios1` FOREIGN KEY (`usuarios_id`) REFERENCES `usuarios` (`id`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `fk_usuarios_persona1` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
