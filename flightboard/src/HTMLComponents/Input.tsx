import "../styles/input.css";

export default function Input(props:any){
    const {type, style} = props;
        return (
            <input type={type} className={style}/>
        );
}