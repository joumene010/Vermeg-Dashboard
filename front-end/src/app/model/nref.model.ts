import { Ref } from './ref.model';

export class Nref extends Ref {
  numericScale: number;
  decimalValue: number;
  rounding: string;

  constructor(init?: Partial<Nref>) {
    super(init);
    Object.assign(this, init);
  }
}