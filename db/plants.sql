-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 24 Apr 2016 la 15:17
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `aircleaningplants`
--

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `plants`
--

CREATE TABLE IF NOT EXISTS `plants` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `substancesToClear` varchar(150) NOT NULL,
  `description` varchar(500) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Salvarea datelor din tabel `plants`
--

INSERT INTO `plants` (`id`, `name`, `substancesToClear`, `description`) VALUES
(1, 'Aloe Vera', 'benzene, formaldehyde, carbon dioxide', 'This purifying plant from South Africa is shown to clear the air of benzene and formaldehyde, both known human carcinogens. Unlike most plants, aloe actually releases oxygen and absorbs carbon dioxide at night, making it ideal for bedrooms. Aloe gel is also medicinal, used externally to treat burns and internally for numerous ailments. It is a sun-loving plant; beware of overwatering it.'),
(2, 'Areca Palm', 'formaldehyde', 'This palm, native to Madagascar, is among the best plants for removing a variety of toxins, especially formaldehyde. It likes bright, indirect light. Because of a high transpiration rate, it adds a lot of humidity to the air and needs to be watered regularly. This plant does not tolerate neglect; its tips will turn brown when moisture, light, temperature and fertilizer levels are not ideal.'),
(3, 'Dracaena', 'formaldehyde, trichloroethylene', 'This is one of the best plants for clearing formaldehyde and trichloroethylene. Although native to tropical Africa, this plant adapts well to indoor environments and can even endure some neglect. It likes moderate to bright indirect light. Water after the soil begins to dry out, and use a pot with drainage holes to avoid soggy soil.'),
(4, 'Dragon Tree', 'xylene, trichloroethylene ,toluene', 'Native to Madagascar, this tree can grow up to 6 feet tall and is among the best plants for removing xylene, trichloroethylene and toluene (the latter is a solvent and additive to gasoline). This is another one of many houseplants belonging to the Dracaena genus and comes in four main varieties. It likes moist soil at all times, but not soggy soil. Keep the plant in semishade, and avoid strong, direct light.'),
(5, 'English Ivy', 'formaldehyde, benzene, even airborne fecal matter', 'An excellent choice for removing formaldehyde, benzene and even airborne fecal matter, this native of Asia, Europe and North Africa is somewhat difficult to grow indoors. It prefers moist air, so mist leaves regularly when humidity is low and keep in bright light. Beware that the leaves are poisonous to pets and humans when ingested.'),
(6, 'Ficus', 'formaldehyde', 'Adept at clearing formaldehyde and a good general air purifier, the new ficus cultivar Ficus alii is rapidly gaining popularity. Native to Thailand, this plant is related to weeping fig, but less finicky and with long pointed leaves. Water thoroughly, allowing the top half-inch of soil to dry out between waterings, and provide bright, indirect light.'),
(7, 'Gerbera Daisy', 'formaldehyde, benzene', 'This lovely plant from Africa adds a splash of color to the room and removes a variety of chemical vapors from the air, notably formaldehyde and benzene. It makes a delightful plant in the summer garden, and if brought indoors in the fall, it may continue to flower through the winter. This is a relatively difficult indoor plant that requires bright light and moderate temperatures.'),
(8, 'Peace Lily', 'acetone, benzene, ammonia, formaldehyde, xylene', 'This lily is adept at removing a variety of alcohols and chemical vapors, including acetone, benzene, ammonia, formaldehyde and xylene, and it scored among the top plants tested for removing several toxins. This easy-to-grow lily can raise humidity levels by up to 5 percent, a helpful feat in dry climates. They enjoy semisun to semishade and being watered a lot at once, then being allowed to dry out.'),
(9, 'Rubber Plant', 'formaldehyde', 'This handsome houseplant from southeast Asia, known botanically as Ficus elastica, is near the top of the list for removing formaldehyde. Under proper conditions, a rubber plant can reach a height of 8 feet. Rubber plant is extremely forgiving. Ideally, it prefers bright, indirect light; regular watering; and mist on its leaves when the air is dry.'),
(10, 'Snake Plant', 'smog, formaldehyde, trichloroethylene, carbon dioxide', 'Native to West Africa, this evergreen perennial clears smog, formaldehyde and trichloroethylene from the air. Like aloe, the snake plant produces oxygen and removes carbon dioxide at nighttime, making it ideal for bedrooms and other low-light rooms. This plant can withstand considerable neglect and infrequent watering.'),
(11, 'Spider Plant', 'smog, formaldehyde, benzene, xylene, carbon monoxide, nitrogen dioxide', 'This flowering perennial is native to Africa and removes smog, formaldehyde, benzene and xylene—found in auto exhaust, synthetic perfume and paint. A NASA study found this plant can remove 96 percent of the carbon monoxide and 99 percent of the nitrogen dioxide within a sealed chamber. This resilient plant thrives in a variety of environments. It prefers medium to bright light, but avoid extended amounts of direct sun.');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
