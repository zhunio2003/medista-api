INSERT INTO antecedente_familiar (alergia_ant, clinico_ant, ginecologo_ant, traumatologico_ant, quirurgico_ant, farmacologico_ant) VALUES (TRUE, FALSE, TRUE, FALSE, TRUE, FALSE);
INSERT INTO antecedente_familiar (alergia_ant, clinico_ant, ginecologo_ant, traumatologico_ant, quirurgico_ant, farmacologico_ant) VALUES (FALSE, TRUE, FALSE, TRUE, FALSE, TRUE);

INSERT INTO doctor (cedula, nombre, apellido, telefono, direccion, especialidad, codigo_msp, genero, password) VALUES ('0102030405', 'Maria Jose', 'Crespo', '0999999999', 'Av. Siempre Viva', 'Medicina General', 'MSP001', 'Femenino', 'Doc1234');
INSERT INTO doctor (cedula, nombre, apellido, telefono, direccion, especialidad, codigo_msp, genero, password) VALUES ('0102030406', 'Andrea', 'Pérez', '0981111111', 'Calle 1', 'Pediatría', 'MSP002', 'Femenino', '1234');

--- PACIENTES
INSERT INTO paciente (cedula, fecha_nacimiento, nombre, apellido, lugar, pais, direccion, barrio, parroquia, canton, provincia, telefono, profesion, tipo_sangre, genero, estado_civil, carrera, ciclo) VALUES ('0912345001', '2001-01-01', 'Miguel', 'Zhunio', 'Cuenca', 'Ecuador', 'Av. Siempre Viva', 'San Sebastián', 'Yanuncay', 'Cuenca', 'Azuay', '0999990001', 'Estudiante', 'O+', 'Masculino', 'Soltero', 'Desarrollo de Software', '6');
INSERT INTO paciente (cedula, fecha_nacimiento, nombre, apellido, lugar, pais, direccion, barrio, parroquia, canton, provincia, telefono, profesion, tipo_sangre, genero, estado_civil, carrera, ciclo) VALUES ('0912345002', '2002-02-02', 'Andrea', 'Pérez', 'Loja', 'Ecuador', 'Calle Bolívar', 'La Argelia', 'San Sebastián', 'Loja', 'Loja', '0999990002', 'Estudiante', 'A+', 'Femenino', 'Soltera', 'Enfermería', '4');

INSERT INTO historial_ginecologico (menarca, ritmo_menstrual, ciclos, ivsa, numero_parejas_sexuales, gestas, abortos, partos, cesareas, dismenorrea, mastodinia, fecha_actualizacion) VALUES (12, '28/4', 28, 16, 2, 1, 0, 1, 0, true, false, '2024-01-10');
INSERT INTO historial_ginecologico (menarca, ritmo_menstrual, ciclos, ivsa, numero_parejas_sexuales, gestas, abortos, partos, cesareas, dismenorrea, mastodinia, fecha_actualizacion) VALUES (13, '30/5', 30, 18, 1, 0, 0, 0, 0, false, true, '2024-01-11');
INSERT INTO historial_ginecologico (menarca, ritmo_menstrual, ciclos, ivsa, numero_parejas_sexuales, gestas, abortos, partos, cesareas, dismenorrea, mastodinia, fecha_actualizacion) VALUES (11, '26/3', 26, 17, 3, 2, 1, 1, 0, true, true, '2024-01-12');


---- FICHA MEDICA
-- Pacientes HOMBRES (sin historial ginecológico - fk_id_his = NULL)
INSERT INTO ficha_medica (fk_id_pac, fk_id_dis, fk_id_ant, fecha_elaboracion, fk_id_his) VALUES (1, NULL, 1, '2024-01-10', NULL);
INSERT INTO ficha_medica (fk_id_pac, fk_id_dis, fk_id_ant, fecha_elaboracion, fk_id_his) VALUES (3, NULL, 3, '2024-01-12', NULL);

-- Pacientes MUJERES (con historial ginecológico - fk_id_his vinculado)
INSERT INTO ficha_medica (fk_id_pac, fk_id_dis, fk_id_ant, fecha_elaboracion, fk_id_his) VALUES (2, NULL, 2, '2024-01-11', 1);
INSERT INTO ficha_medica (fk_id_pac, fk_id_dis, fk_id_ant, fecha_elaboracion, fk_id_his) VALUES (4, NULL, 4, '2024-01-13', 2);


INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('K29.0', 'Gastritis aguda', 'Digestiva', 'Inflamación aguda del revestimiento del estómago', 'Dolor abdominal, náuseas, vómito');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('K35', 'Apendicitis aguda', 'Digestiva', 'Inflamación del apéndice', 'Dolor abdominal intenso, fiebre, náuseas');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('E11', 'Diabetes mellitus tipo 2', 'Endocrina', 'Trastorno metabólico por resistencia a la insulina', 'Sed excesiva, orina frecuente, fatiga');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('I10', 'Hipertensión esencial', 'Cardiovascular', 'Presión arterial persistentemente elevada', 'Dolor de cabeza, visión borrosa, fatiga');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('J45', 'Asma', 'Respiratoria', 'Inflamación crónica de las vías respiratorias', 'Tos, sibilancias, dificultad para respirar');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('J02.9', 'Faringitis aguda', 'Respiratoria', 'Inflamación de la faringe por virus', 'Dolor de garganta, fiebre, malestar');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('J20', 'Bronquitis aguda', 'Respiratoria', 'Inflamación temporal de los bronquios', 'Tos con flema, fiebre, fatiga');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('N39.0', 'Infección del tracto urinario', 'Urinaria', 'Presencia de bacterias en vías urinarias', 'Dolor al orinar, fiebre, urgencia miccional');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('G43.0', 'Migraña sin aura', 'Neurológica', 'Cefalea intensa recurrente', 'Dolor pulsátil, náuseas, fotofobia');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('D50', 'Anemia por deficiencia de hierro', 'Hematológica', 'Reducción de glóbulos rojos por falta de hierro', 'Cansancio, palidez, mareos');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('L20.9', 'Dermatitis atópica', 'Dermatológica', 'Enfermedad inflamatoria crónica de la piel', 'Picazón, enrojecimiento, sequedad');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('B01', 'Varicela', 'Infecciosa', 'Infección viral contagiosa por virus varicela-zóster', 'Erupciones, fiebre, malestar general');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('A09', 'Gastroenteritis viral', 'Digestiva', 'Inflamación de estómago e intestino por virus', 'Diarrea, vómitos, deshidratación');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('H66', 'Otitis media', 'Otorrinolaringológica', 'Inflamación del oído medio', 'Dolor de oído, fiebre, pérdida de audición');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('M05', 'Artritis reumatoide', 'Reumatológica', 'Enfermedad autoinmune que afecta las articulaciones', 'Dolor articular, rigidez, inflamación');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('U07.1', 'COVID-19 confirmado por laboratorio', 'Infecciosa', 'Infección respiratoria causada por SARS-CoV-2', 'Fiebre, tos, pérdida del olfato');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('A90', 'Fiebre del dengue', 'Infecciosa', 'Infección viral transmitida por mosquito Aedes', 'Fiebre alta, dolor de cabeza, dolor muscular');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('E03.9', 'Hipotiroidismo', 'Endocrina', 'Producción insuficiente de hormonas tiroideas', 'Cansancio, aumento de peso, piel seca');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('M32.1', 'Lupus eritematoso sistémico', 'Autoinmune', 'Enfermedad crónica que afecta múltiples órganos', 'Fatiga, erupción facial, dolor articular');
INSERT INTO enfermedad (codigo_enf, nombre_enf, tipo_enf, descripcion_enf, sintomas_enf) VALUES ('G40.9', 'Epilepsia no especificada', 'Neurológica', 'Trastorno caracterizado por crisis epilépticas', 'Convulsiones, pérdida de conciencia');


INSERT INTO discapacidad (discapacidad_g, porcentaje_dis, subtipo_dis, carnet_con, numero_conadis) VALUES (true, 45.0, 'Auditiva', true, 100001);
INSERT INTO discapacidad (discapacidad_g, porcentaje_dis, subtipo_dis, carnet_con, numero_conadis) VALUES (false, 0.0, NULL, false, 0);

