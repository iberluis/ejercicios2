/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IBER LUIS
 */
public class cls_aspirantes {
    int idint=0;
    String nombresint;
    String apellidosstr;
    String telefonostr;
    String correostr;
    String sexostr;
    String perfil_laboralstr;
    String estudiosstr;
    public cls_aspirantes(int idint, String nombresint, String apellidosstr, String telefonostr, String correostr,
            String sexostr, String perfil_laboralstr, String estudiosstr) {
        this.idint = idint;
        this.nombresint = nombresint;
        this.apellidosstr = apellidosstr;
        this.telefonostr = telefonostr;
        this.correostr = correostr;
        this.sexostr = sexostr;
        this.perfil_laboralstr = perfil_laboralstr;
        this.estudiosstr = estudiosstr;
    }
    public int getIdint() {
        return idint;
    }
    public void setIdint(int idint) {
        this.idint = idint;
    }
    public String getNombresint() {
        return nombresint;
    }
    public void setNombresint(String nombresint) {
        this.nombresint = nombresint;
    }
    public String getApellidosstr() {
        return apellidosstr;
    }
    public void setApellidosstr(String apellidosstr) {
        this.apellidosstr = apellidosstr;
    }
    public String getTelefonostr() {
        return telefonostr;
    }
    public void setTelefonostr(String telefonostr) {
        this.telefonostr = telefonostr;
    }
    public String getCorreostr() {
        return correostr;
    }
    public void setCorreostr(String correostr) {
        this.correostr = correostr;
    }
    public String getSexostr() {
        return sexostr;
    }
    public void setSexostr(String sexostr) {
        this.sexostr = sexostr;
    }
    public String getPerfil_laboralstr() {
        return perfil_laboralstr;
    }
    public void setPerfil_laboralstr(String perfil_laboralstr) {
        this.perfil_laboralstr = perfil_laboralstr;
    }
    public String getEstudiosstr() {
        return estudiosstr;
    }
    public void setEstudiosstr(String estudiosstr) {
        this.estudiosstr = estudiosstr;
    }

}    