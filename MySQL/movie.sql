CREATE TABLE `actors` (
  `actor` varchar(20) NOT NULL,
  `ayear` float DEFAULT NULL
);

INSERT INTO `actors` (`actor`, `ayear`) VALUES
('Cage', 1964),
('Hanks', 1956),
('Maguire', 1975),
('McDormand', 1957);

CREATE TABLE `acts` (
  `actor` varchar(20) DEFAULT NULL,
  `title` varchar(20) DEFAULT NULL
);

INSERT INTO `acts` (`actor`, `title`) VALUES
('Cage', 'Raising Arizona'),
('Maguire', 'Spiderman'),
('Maguire', 'Wonder Boys'),
('McDormand', 'Fargo'),
('McDormand', 'Raising Arizona'),
('McDormand', 'Wonder Boys');

CREATE TABLE `directors` (
  `director` varchar(20) DEFAULT NULL,
  `dyear` float DEFAULT NULL
);

INSERT INTO `directors` (`director`, `dyear`) VALUES
('Coen', 1954),
('Hanson', 1945),
('Raimi', 1959);

CREATE TABLE `movies` (
  `title` varchar(20) NOT NULL,
  `director` varchar(20) DEFAULT NULL,
  `myear` bigint(11) DEFAULT NULL,
  `rating` float DEFAULT NULL
);


INSERT INTO `movies` (`title`, `director`, `myear`, `rating`) VALUES
('Fargo', 'Coen', 1996, 8.2),
('Raising Arizona', 'Coen', 1987, 7.6),
('Spiderman', 'Raimi', 2002, 7.4),
('Wonder Boys', 'Hanson', 2002, 7.6);

ALTER TABLE `actors`
  ADD PRIMARY KEY (`actor`);

ALTER TABLE `movies`
  ADD PRIMARY KEY (`title`);

