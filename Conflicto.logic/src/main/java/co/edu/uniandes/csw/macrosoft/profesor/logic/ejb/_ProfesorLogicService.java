/* ========================================================================
 * Copyright 2014 macrosoft
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 macrosoft

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201408112050

*/

package co.edu.uniandes.csw.macrosoft.profesor.logic.ejb;
import java.util.List;
import javax.inject.Inject;

import co.edu.uniandes.csw.macrosoft.profesor.logic.dto.ProfesorDTO;
import co.edu.uniandes.csw.macrosoft.profesor.logic.api._IProfesorLogicService;
import co.edu.uniandes.csw.macrosoft.profesor.persistence.api.IProfesorPersistence;

public abstract class _ProfesorLogicService implements _IProfesorLogicService {

	@Inject
	protected IProfesorPersistence persistance;

	public ProfesorDTO createProfesor(ProfesorDTO profesor){
		return persistance.createProfesor( profesor); 
    }

	public List<ProfesorDTO> getProfesors(){
		return persistance.getProfesors(); 
	}

	public ProfesorDTO getProfesor(Long id){
		return persistance.getProfesor(id); 
	}

	public void deleteProfesor(Long id){
	    persistance.deleteProfesor(id); 
	}

	public void updateProfesor(ProfesorDTO profesor){
	    persistance.updateProfesor(profesor); 
	}	
}