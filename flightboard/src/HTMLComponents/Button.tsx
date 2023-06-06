import "../styles/button.css";
export default function Button(props:any){
    const {style, text, customClick} = props;
    return (
        <button className={style}>
            {text}
        </button>
    )
}