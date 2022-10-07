select animal_ins.animal_id, animal_ins.animal_type, animal_ins.name from animal_ins left join animal_outs on animal_ins.animal_id = animal_outs.animal_id

where animal_outs.sex_upon_outcome in ("Spayed Male", "Spayed Female", "Neutered Male", "Neutered Female") and animal_ins.sex_upon_intake in ("Intact Male", "Intact Female")


order by animal_ins.animal_id