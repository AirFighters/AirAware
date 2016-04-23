-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Gazda: 127.0.0.1
-- Timp de generare: 23 Apr 2016 la 12:32
-- Versiune server: 5.5.27-log
-- Versiune PHP: 5.4.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Baza de date: `airpllutiondiseases`
--

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `diseases`
--

CREATE TABLE IF NOT EXISTS `diseases` (
  `index` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `symptoms` varchar(500) NOT NULL,
  PRIMARY KEY (`index`),
  KEY `index` (`index`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=43 ;

--
-- Salvarea datelor din tabel `diseases`
--

INSERT INTO `diseases` (`index`, `name`, `symptoms`) VALUES
(1, 'Asthma', 'Asthma is a lung condition that makes it hard to breathe, an asthma attack can be life threatening. For children causes swelling and narrowing in the airways, causing cough.'),
(2, 'Common cold', 'The common cold is a viral respiratory infection causing sore throat, stuffy or runny nose, headache and more. '),
(3, 'Bronchitis', 'Bronchitis, an inflammation of the bronchial tubes, causes cough, dark or yellow mucus, chest pain and more.'),
(4, 'Allergic reaction', 'Allergic reaction causes sneezing, runny nose and hives and can lead to anaphylaxis, a whole body reaction.'),
(5, 'Indoor allergens', 'Indoor allergens are the things that cause an allergic reaction: dust, dust mites, mold, pet hair and more.'),
(6, 'Hay fever', 'Hay fever, an allergic reaction to outdoor pollens and molds, causes nasal congestion, itchy eyes, and more.'),
(7, 'Acute sinusitis', 'Acute sinusitis, an inflammation of the sinuses, causes sinus pain and tenderness, facial redness and more.'),
(8, 'Chronic obstructive pulmonary disease (COPD)', 'COPD is a chronic lung disease that makes breathing difficult.'),
(9, 'Heartburn/GERD', 'Symptoms of heartburn and GERD are a burning feeling in the chest, throat, or mouth, nausea, and more.'),
(10, 'Dust exposure', 'Dust exposure can cause congestion, runny nose, cough, shortness of breath, tightness in the chest, and more.'),
(11, 'Small cell lung cancer', 'Small cell lung cancer is the least common type of lung cancer and can cause a cough, chest pain, and more.'),
(12, 'Asbestosis', 'Asbestosis is a serious lung disease, causing shortness of breath, dry cough, chest tightness and more.'),
(13, 'Bronchial adenoma', 'Bronchial adenomas are cancers of the respiratory tract causing a cough, fever, or shortness of breath.'),
(14, 'Non-small cell lung cancer', 'Non-small cell lung cancer is the most common type of lung cancer and can cause a cough, chest pain, and more.'),
(15, 'Emphysema', 'Emphysema is a chronic lung condition that causes shortness of breath, a chronic cough, wheezing, and more.'),
(16, 'Pneumonia', 'Pneumonia is a lung infection and causes cough, shortness of breath, wheezing, chest pain, fever, and chills.'),
(17, 'Nasal congestion', 'Nasal congestion is a stuffy nose, and can be accompanied by blocked ears, sore throat, and more.'),
(18, 'Smoke exposure', 'Exposure to smoke can cause coughing, wheezing, shortness of breath, chest tightness, chest pain, and more.'),
(19, 'Chronic sinusitis', 'Chronic sinusitis, or sinus infections, cause a stuffy or runny nose, tooth pain, fever, sore throat and more.'),
(20, 'Chemical pneumonia', 'Chemical pneumonia is an irritation of the lungs that can cause a dry cough, headache, chest pain and more.'),
(21, 'Cryptococcosis', 'Cryptococcosis is a lung disease causing a wide range of digestive, respiratory and cardiovascular symptoms.'),
(22, 'Histoplasmosis', 'Histoplasmosis is a fungal infection of the lungs causing muscle aches, fever, chest pain, cough, and more.'),
(23, 'Viral pneumonia', 'Viral pneumonia is a lung infection caused by viruses, and causes coughing, wheezing, fever, chills, and more.'),
(24, 'Anaphylactic shock', 'Anaphylactic shock is a sudden severe allergic reaction marked by breathing trouble, a tight throat, and more.'),
(25, 'Upper airway obstruction', 'Symptoms of upper airway obstruction include difficulty breathing, wheezing, agitation, gasping, and more.'),
(26, 'Bronchiolitis', 'Bronchiolitis, a common lung infection in children, causes a runny nose, cough, fever, wheezing and more.'),
(27, 'Nasal polyps', 'Nasal polyps, sacs of inflamed tissue in the nasal passages, can cause cold symptoms, snoring, and more.'),
(28, 'Nonallergic rhinitis', 'Non-allergic rhinitis causes congestion, sneezing, runny nose, or itchy red eyes for no apparent reason.'),
(29, 'Interstitial lung disease', 'Interstitial lung disease is a group of lung disorders that cause shortness of breath, a dry cough, and more.'),
(30, 'Croup', 'Croup is a childhood viral respiratory infection causing swelling that can make breathing difficult and noisy.'),
(31, 'Congestive heart failure', 'People with congestive heart failure can have shortness of breath, fatigue, irregular heartbeat and more.'),
(32, 'Exercise-induced asthma', 'Exercise-induced asthma causes wheezing, coughing, shortness of breath, and chest tightness.'),
(33, 'Pneumonitis', 'Pneumonitis is any inflammation of the lung and causes trouble breathing, cough, and fever.'),
(34, 'Pulmonary embolism', 'A pulmonary embolism, a blood clot lodged in the lung, causes shortness of breath, chest pain, and more.'),
(35, 'Pulmonary fibrosis', 'Pulmonary fibrosis is a serious chronic lung condition where the lungs become scarred and stiff.'),
(36, 'Thyroid cancer', 'Thyroid cancer is cancer of the thyroid gland and can cause a cough, hoarseness, a lump in the neck, and more.'),
(37, 'Tuberculosis', 'Tuberculosis usually infects the lungs, causing a bad cough with blood, chest pain, fever, chills, and fatigue.'),
(38, 'Whooping cough', 'Whooping cough, a contagious respiratory infection, causes a runny nose, a mild fever, and a severe cough.'),
(39, 'Conjunctivitis', 'Conjunctivitis symptoms are: itchy, red, watering eyes'),
(40, 'Hives', 'Hives symptoms are:  wheezing, chest tightness, shortness of breath and a cough a raised, itchy, red rash'),
(41, 'Allergic rhinitis', 'Allergic rhinitis causes sneezing and an itchy, runny or blocked nose'),
(42, 'General Allergy', 'When you have an allergic reaction there may be a combination of the following allergy symptoms: sneezing,  wheezing, nasal congestion, coughing, itchy, watery eyes, runny nose, itchy throat, stomach ache,  itchy skin,  hives, fatigue, irritability');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
