import "../styles/input.css";

export default function Input(props:any){
    const {type, style_type} = props;
        return (
            <input type={type} className={style_type}/>
        );
}