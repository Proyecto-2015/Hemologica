UPDATE persons_records 
SET person_record_identification_id = to_base64(
										aes_encrypt(
											person_record_identification_id,
											from_base64('MbZBwR2U77CV6px61BfJIg==')
											)
										);